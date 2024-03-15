--
-- Pinterest REST API.
-- Prepared SQL queries for 'ItemResponse_anyOf' definition.
--


--
-- SELECT template for table `ItemResponse_anyOf`
--
SELECT `catalog_type`, `item_id`, `pins`, `attributes`, `hotel_id` FROM `ItemResponse_anyOf` WHERE 1;

--
-- INSERT template for table `ItemResponse_anyOf`
--
INSERT INTO `ItemResponse_anyOf`(`catalog_type`, `item_id`, `pins`, `attributes`, `hotel_id`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `ItemResponse_anyOf`
--
UPDATE `ItemResponse_anyOf` SET `catalog_type` = ?, `item_id` = ?, `pins` = ?, `attributes` = ?, `hotel_id` = ? WHERE 1;

--
-- DELETE template for table `ItemResponse_anyOf`
--
DELETE FROM `ItemResponse_anyOf` WHERE 0;

