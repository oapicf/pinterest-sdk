--
-- Pinterest REST API.
-- Prepared SQL queries for 'ItemResponse_oneOf_1' definition.
--


--
-- SELECT template for table `ItemResponse_oneOf_1`
--
SELECT `catalog_type`, `errors`, `item_id`, `hotel_id`, `creative_assets_id` FROM `ItemResponse_oneOf_1` WHERE 1;

--
-- INSERT template for table `ItemResponse_oneOf_1`
--
INSERT INTO `ItemResponse_oneOf_1`(`catalog_type`, `errors`, `item_id`, `hotel_id`, `creative_assets_id`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `ItemResponse_oneOf_1`
--
UPDATE `ItemResponse_oneOf_1` SET `catalog_type` = ?, `errors` = ?, `item_id` = ?, `hotel_id` = ?, `creative_assets_id` = ? WHERE 1;

--
-- DELETE template for table `ItemResponse_oneOf_1`
--
DELETE FROM `ItemResponse_oneOf_1` WHERE 0;

