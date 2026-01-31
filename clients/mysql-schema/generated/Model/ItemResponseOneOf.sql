--
-- Pinterest REST API.
-- Prepared SQL queries for 'ItemResponse_oneOf' definition.
--


--
-- SELECT template for table `ItemResponse_oneOf`
--
SELECT `catalog_type`, `attributes`, `item_id`, `pins`, `hotel_id`, `creative_assets_id` FROM `ItemResponse_oneOf` WHERE 1;

--
-- INSERT template for table `ItemResponse_oneOf`
--
INSERT INTO `ItemResponse_oneOf`(`catalog_type`, `attributes`, `item_id`, `pins`, `hotel_id`, `creative_assets_id`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `ItemResponse_oneOf`
--
UPDATE `ItemResponse_oneOf` SET `catalog_type` = ?, `attributes` = ?, `item_id` = ?, `pins` = ?, `hotel_id` = ?, `creative_assets_id` = ? WHERE 1;

--
-- DELETE template for table `ItemResponse_oneOf`
--
DELETE FROM `ItemResponse_oneOf` WHERE 0;

