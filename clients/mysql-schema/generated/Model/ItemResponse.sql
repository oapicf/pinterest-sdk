--
-- Pinterest REST API.
-- Prepared SQL queries for 'ItemResponse' definition.
--


--
-- SELECT template for table `ItemResponse`
--
SELECT `catalog_type`, `item_id`, `pins`, `attributes`, `hotel_id`, `errors` FROM `ItemResponse` WHERE 1;

--
-- INSERT template for table `ItemResponse`
--
INSERT INTO `ItemResponse`(`catalog_type`, `item_id`, `pins`, `attributes`, `hotel_id`, `errors`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `ItemResponse`
--
UPDATE `ItemResponse` SET `catalog_type` = ?, `item_id` = ?, `pins` = ?, `attributes` = ?, `hotel_id` = ?, `errors` = ? WHERE 1;

--
-- DELETE template for table `ItemResponse`
--
DELETE FROM `ItemResponse` WHERE 0;

