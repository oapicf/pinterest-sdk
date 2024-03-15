--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsRetailItemsFilter' definition.
--


--
-- SELECT template for table `CatalogsRetailItemsFilter`
--
SELECT `catalog_type`, `item_ids`, `catalog_id` FROM `CatalogsRetailItemsFilter` WHERE 1;

--
-- INSERT template for table `CatalogsRetailItemsFilter`
--
INSERT INTO `CatalogsRetailItemsFilter`(`catalog_type`, `item_ids`, `catalog_id`) VALUES (?, ?, ?);

--
-- UPDATE template for table `CatalogsRetailItemsFilter`
--
UPDATE `CatalogsRetailItemsFilter` SET `catalog_type` = ?, `item_ids` = ?, `catalog_id` = ? WHERE 1;

--
-- DELETE template for table `CatalogsRetailItemsFilter`
--
DELETE FROM `CatalogsRetailItemsFilter` WHERE 0;

