CREATE TABLE `t_goods` (
  `id` INT NOT NULL PRIMARY KEY ,
  `name` VARCHAR(255) NOT NULL ,
  `description` VARCHAR(255) NOT NULL ,
  `price` DOUBLE DEFAULT 0,
  `amount` INT DEFAULT 0
)