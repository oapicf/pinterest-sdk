--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsRetailItemsFilter' definition.
--


--
-- SELECT template for table `CatalogsRetailItemsFilter`
--
SELECT `catalog_id`, `catalog_type`, `item_ids` FROM `CatalogsRetailItemsFilter` WHERE 1;

--
-- INSERT template for table `CatalogsRetailItemsFilter`
--
INSERT INTO `CatalogsRetailItemsFilter`(`catalog_id`, `catalog_type`, `item_ids`) VALUES (?, ?, ?);

--
-- UPDATE template for table `CatalogsRetailItemsFilter`
--
UPDATE `CatalogsRetailItemsFilter` SET `catalog_id` = ?, `catalog_type` = ?, `item_ids` = ? WHERE 1;

--
-- DELETE template for table `CatalogsRetailItemsFilter`
--
DELETE FROM `CatalogsRetailItemsFilter` WHERE 0;

