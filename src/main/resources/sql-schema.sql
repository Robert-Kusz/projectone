drop schema IF EXISTS ims;
CREATE SCHEMA IF NOT EXISTS `ims`;
USE `ims` ;
CREATE TABLE IF NOT EXISTS `ims`.`customers` (
  `id` INT(11)  AUTO_INCREMENT,
  `first_name` VARCHAR(40) ,
  `surname` VARCHAR(40) ,
  PRIMARY KEY (`id` )
);
CREATE TABLE IF NOT EXISTS `ims`.`items` (
  `id` INT(5)  AUTO_INCREMENT,
  `item_name` VARCHAR(40) ,
  `cost` DOUBLE(10,2) ,
  PRIMARY KEY ( `id`)
);



CREATE TABLE IF NOT EXISTS `ims`.`order_items` (

    `orders_id` INT (5) NOT NULL auto_increment,
    `order_item` VARCHAR (40) NOT NULL,
    `order_quantity` INT (5) NOT NULL,
    `order_cost` DOUBLE (5,2) NOT NULL,

    PRIMARY KEY (`order_items_id`),
    FOREIGN KEY (`order_id`),
    FOREIGN KEY (`item_id`).

    CREATE TABLE IF NOT EXISTS `ims`.`orders`(
    `order_id` INT (5) NOT NULL AUTO_INCREMENT,
`customer_name` VARCHAR (40) NOT NULL,
        `items_ordered` VARCHAR (40),
`order_total` DOUBLE(5,2) NOT NULL,
`

    PRIMARY KEY (`order_ID`),
    FOREIGN KEY (`order_items`),
    FOREIGN KEY (`items`),
    FOREIGN KEY (`customers`),
    )
);









