--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsRetailProductMetadata' definition.
--


--
-- SELECT template for table `CatalogsRetailProductMetadata`
--
SELECT `availability`, `currency`, `item_group_id`, `item_id`, `price`, `sale_price` FROM `CatalogsRetailProductMetadata` WHERE 1;

--
-- INSERT template for table `CatalogsRetailProductMetadata`
--
INSERT INTO `CatalogsRetailProductMetadata`(`availability`, `currency`, `item_group_id`, `item_id`, `price`, `sale_price`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsRetailProductMetadata`
--
UPDATE `CatalogsRetailProductMetadata` SET `availability` = ?, `currency` = ?, `item_group_id` = ?, `item_id` = ?, `price` = ?, `sale_price` = ? WHERE 1;

--
-- DELETE template for table `CatalogsRetailProductMetadata`
--
DELETE FROM `CatalogsRetailProductMetadata` WHERE 0;

