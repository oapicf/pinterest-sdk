--
-- Pinterest REST API.
-- Prepared SQL queries for 'StoreMetadata' definition.
--


--
-- SELECT template for table `StoreMetadata`
--
SELECT `geohash`, `latitude`, `longitude`, `store_code`, `store_id`, `store_name` FROM `StoreMetadata` WHERE 1;

--
-- INSERT template for table `StoreMetadata`
--
INSERT INTO `StoreMetadata`(`geohash`, `latitude`, `longitude`, `store_code`, `store_id`, `store_name`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `StoreMetadata`
--
UPDATE `StoreMetadata` SET `geohash` = ?, `latitude` = ?, `longitude` = ?, `store_code` = ?, `store_id` = ?, `store_name` = ? WHERE 1;

--
-- DELETE template for table `StoreMetadata`
--
DELETE FROM `StoreMetadata` WHERE 0;

