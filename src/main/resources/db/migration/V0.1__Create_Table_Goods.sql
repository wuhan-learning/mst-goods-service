CREATE TABLE `t_goods` (
  `id` BIGINT(20) NOT NULL PRIMARY KEY ,
  `name` VARCHAR(255) NOT NULL ,
  `description` VARCHAR(255) NOT NULL ,
  `price` DOUBLE DEFAULT 0,
  `amount` BIGINT(20) DEFAULT 0
)