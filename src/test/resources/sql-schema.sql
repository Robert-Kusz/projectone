drop schema if exists ims;
CREATE SCHEMA IF NOT EXISTS `ims`;
USE `ims` ;
CREATE TABLE IF NOT EXISTS `ims`.`customers` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `first_name` VARCHAR(40) DEFAULT NULL,
  `surname` VARCHAR(40) DEFAULT NULL,
  PRIMARY KEY (`id` INT (5))
);
CREATE TABLE IF NOT EXISTS `ims` . `items` (
  `Item_id INT(5) NOT NULL AUTO_INCREMENT,
  `item_name` VARCHAR(40) DEFAULT NULL
  `item_price` DOUBLE(10) DEFAULT NULL
  PRIMARY KEY ( `Item_id` INT (5))
);
CREATE TABLE IF NOT EXISTS `ims` . `orders` (
  `Order_id INT(5) NOT NULL AUTO_INCREMENT,
  `Order_name` VARCHAR(40) DEFAULT NULL
  `Order_total DOUBLE(10) DEFAULT NULL
  PRIMARY KEY ( `Order_id` INT (5))
);