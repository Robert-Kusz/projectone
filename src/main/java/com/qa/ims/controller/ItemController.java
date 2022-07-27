package com.qa.ims.controller;

import com.qa.ims.persistence.dao.ItemDAO;
import com.qa.ims.persistence.domain.Item;
import com.qa.ims.utils.Utils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;


public class ItemController implements CrudController<Item> {


    public static final Logger LOGGER = LogManager.getLogger();


    private ItemDAO itemDAO;
    private Utils utils;

    public ItemController(ItemDAO itemDAO, Utils utils) {
        super();
        this.itemDAO = itemDAO;
        this.utils = utils;
    }

    /**
     * Reads all Itemss to the logger
     */
    @Override
    public List<Item> readAll() {
        List<Item> items = itemDAO.readAll();
        for (Item item : items) {
            LOGGER.info(item);
        }
        return items;
    }


    /**
     * Creates a Items by taking in user input
     */
    @Override
    public Item create() {
        LOGGER.info("Please enter a item name");
        String itemName = utils.getString();
        LOGGER.info("Please enter a cost");
        Double itemCost = utils.getDouble();
        Item item = itemDAO.create(new Item(itemName, itemCost));
        LOGGER.info("Items created");
        return item;
    }

    /**
     * Updates an existing Items by taking in user input
     */
    @Override
    public Item update() {
        LOGGER.info("Please enter the id of the Items you would like to update");
        Long id = utils.getLong();
        LOGGER.info("Please enter a item name");
        String itemName = utils.getString();
        LOGGER.info("Please enter a item cost");
        String cost = utils.getString();
        Item item = itemDAO.update(new Item(id, itemName, Double.parseDouble(cost)));
        LOGGER.info("Items Updated");
        return item;

    }

    /**
     * Deletes an existing Items by the id of the Items
     *
     * @return
     */
    @Override
    public int delete() {
        LOGGER.info("Please enter the id of the Items you would like to delete");
        Long id = utils.getLong();
        return itemDAO.delete(id);
    }


    public Utils getUtils() {
        return utils;
    }

    public void setUtils(Utils utils) {
        this.utils = utils;
    }
}


