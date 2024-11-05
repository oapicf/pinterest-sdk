--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsItemsPostFilters' definition.
--


--
-- SELECT template for table `CatalogsItemsPostFilters`
--
SELECT `catalog_type`, `item_ids`, `catalog_id`, `hotel_ids`, `creative_assets_ids` FROM `CatalogsItemsPostFilters` WHERE 1;

--
-- INSERT template for table `CatalogsItemsPostFilters`
--
INSERT INTO `CatalogsItemsPostFilters`(`catalog_type`, `item_ids`, `catalog_id`, `hotel_ids`, `creative_assets_ids`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsItemsPostFilters`
--
UPDATE `CatalogsItemsPostFilters` SET `catalog_type` = ?, `item_ids` = ?, `catalog_id` = ?, `hotel_ids` = ?, `creative_assets_ids` = ? WHERE 1;

--
-- DELETE template for table `CatalogsItemsPostFilters`
--
DELETE FROM `CatalogsItemsPostFilters` WHERE 0;

