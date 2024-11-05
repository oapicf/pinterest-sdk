--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsItemsFilters' definition.
--


--
-- SELECT template for table `CatalogsItemsFilters`
--
SELECT `catalog_type`, `item_ids`, `catalog_id`, `hotel_ids`, `creative_assets_ids` FROM `CatalogsItemsFilters` WHERE 1;

--
-- INSERT template for table `CatalogsItemsFilters`
--
INSERT INTO `CatalogsItemsFilters`(`catalog_type`, `item_ids`, `catalog_id`, `hotel_ids`, `creative_assets_ids`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsItemsFilters`
--
UPDATE `CatalogsItemsFilters` SET `catalog_type` = ?, `item_ids` = ?, `catalog_id` = ?, `hotel_ids` = ?, `creative_assets_ids` = ? WHERE 1;

--
-- DELETE template for table `CatalogsItemsFilters`
--
DELETE FROM `CatalogsItemsFilters` WHERE 0;

