--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsRetailItemsPostFilter' definition.
--


--
-- SELECT template for table `CatalogsRetailItemsPostFilter`
--
SELECT `catalog_id`, `catalog_type`, `item_ids` FROM `CatalogsRetailItemsPostFilter` WHERE 1;

--
-- INSERT template for table `CatalogsRetailItemsPostFilter`
--
INSERT INTO `CatalogsRetailItemsPostFilter`(`catalog_id`, `catalog_type`, `item_ids`) VALUES (?, ?, ?);

--
-- UPDATE template for table `CatalogsRetailItemsPostFilter`
--
UPDATE `CatalogsRetailItemsPostFilter` SET `catalog_id` = ?, `catalog_type` = ?, `item_ids` = ? WHERE 1;

--
-- DELETE template for table `CatalogsRetailItemsPostFilter`
--
DELETE FROM `CatalogsRetailItemsPostFilter` WHERE 0;

