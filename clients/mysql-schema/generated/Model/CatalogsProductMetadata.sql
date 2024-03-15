--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsProductMetadata' definition.
--


--
-- SELECT template for table `CatalogsProductMetadata`
--
SELECT `item_id`, `item_group_id`, `availability`, `price`, `sale_price`, `currency` FROM `CatalogsProductMetadata` WHERE 1;

--
-- INSERT template for table `CatalogsProductMetadata`
--
INSERT INTO `CatalogsProductMetadata`(`item_id`, `item_group_id`, `availability`, `price`, `sale_price`, `currency`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsProductMetadata`
--
UPDATE `CatalogsProductMetadata` SET `item_id` = ?, `item_group_id` = ?, `availability` = ?, `price` = ?, `sale_price` = ?, `currency` = ? WHERE 1;

--
-- DELETE template for table `CatalogsProductMetadata`
--
DELETE FROM `CatalogsProductMetadata` WHERE 0;

