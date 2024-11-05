--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsRetailProductMetadata' definition.
--


--
-- SELECT template for table `CatalogsRetailProductMetadata`
--
SELECT `item_id`, `item_group_id`, `availability`, `price`, `sale_price`, `currency` FROM `CatalogsRetailProductMetadata` WHERE 1;

--
-- INSERT template for table `CatalogsRetailProductMetadata`
--
INSERT INTO `CatalogsRetailProductMetadata`(`item_id`, `item_group_id`, `availability`, `price`, `sale_price`, `currency`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsRetailProductMetadata`
--
UPDATE `CatalogsRetailProductMetadata` SET `item_id` = ?, `item_group_id` = ?, `availability` = ?, `price` = ?, `sale_price` = ?, `currency` = ? WHERE 1;

--
-- DELETE template for table `CatalogsRetailProductMetadata`
--
DELETE FROM `CatalogsRetailProductMetadata` WHERE 0;

