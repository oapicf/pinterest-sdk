--
-- Pinterest REST API.
-- Prepared SQL queries for 'ItemResponse_anyOf_1' definition.
--


--
-- SELECT template for table `ItemResponse_anyOf_1`
--
SELECT `catalog_type`, `item_id`, `errors`, `hotel_id`, `creative_assets_id` FROM `ItemResponse_anyOf_1` WHERE 1;

--
-- INSERT template for table `ItemResponse_anyOf_1`
--
INSERT INTO `ItemResponse_anyOf_1`(`catalog_type`, `item_id`, `errors`, `hotel_id`, `creative_assets_id`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `ItemResponse_anyOf_1`
--
UPDATE `ItemResponse_anyOf_1` SET `catalog_type` = ?, `item_id` = ?, `errors` = ?, `hotel_id` = ?, `creative_assets_id` = ? WHERE 1;

--
-- DELETE template for table `ItemResponse_anyOf_1`
--
DELETE FROM `ItemResponse_anyOf_1` WHERE 0;

