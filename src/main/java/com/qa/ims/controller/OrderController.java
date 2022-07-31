package com.qa.ims.controller;


import com.qa.ims.persistence.dao.OrderDAO;
import com.qa.ims.persistence.domain.Order;
import com.qa.ims.utils.Utils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class OrderController implements CrudController<Order> {
    public static final Logger LOGGER = LogManager.getLogger();

    private OrderDAO orderDAO;
    private Utils utils;

    public OrderController(OrderDAO orderDao, Utils utils) {
        super();
        this.orderDAO = orderDao;
        this.utils = utils;
    }

    @Override
    public List<Order> readAll() {
        List<Order> orders = orderDAO.readAll();
        for (Order order : orders) {
            LOGGER.info(order);
        }
        return orders;
    }

    @Override
    public Order create() {
        LOGGER.info("please enter your customer id");
        Long id = utils.getLong();
        LOGGER.info("please enter item name");
        String itemName = utils.getString();
        LOGGER.info("enter item cost");
        Double cost = utils.getDouble();
        Order order = new Order(id, itemName);
        LOGGER.info("order created");
        return order;
    }


    @Override
    public Order update() {
        LOGGER.info("please enter your customer id and we will update your order");
        Long id = utils.getLong();
        LOGGER.info("Please enter your new item name");
        String itemName = utils.getString();
        LOGGER.info("please enter new item cost");
        Double cost = utils.getDouble();
        Order order = orderDAO.update(new Order(id, itemName, cost));
        LOGGER.info(" order updated");
        return order;
    }

    @Override
    public int delete() {
        LOGGER.info("please enter the order number");
        Long id = utils.getLong();
        return orderDAO.delete(id);
    }

}








