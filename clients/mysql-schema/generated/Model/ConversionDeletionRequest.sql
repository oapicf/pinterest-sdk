--
-- Pinterest REST API.
-- Prepared SQL queries for 'ConversionDeletionRequest' definition.
--


--
-- SELECT template for table `ConversionDeletionRequest`
--
SELECT `created_time`, `processed_time`, `request_id`, `status` FROM `ConversionDeletionRequest` WHERE 1;

--
-- INSERT template for table `ConversionDeletionRequest`
--
INSERT INTO `ConversionDeletionRequest`(`created_time`, `processed_time`, `request_id`, `status`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `ConversionDeletionRequest`
--
UPDATE `ConversionDeletionRequest` SET `created_time` = ?, `processed_time` = ?, `request_id` = ?, `status` = ? WHERE 1;

--
-- DELETE template for table `ConversionDeletionRequest`
--
DELETE FROM `ConversionDeletionRequest` WHERE 0;

