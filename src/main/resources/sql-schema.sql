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
CREATE TABLE IF NOT EXISTS `ims`.`orders` (
  `Order_id` INT(5)  AUTO_INCREMENT,
  `Order_name` VARCHAR(40) ,
  PRIMARY KEY ( `Order_id` )
);









