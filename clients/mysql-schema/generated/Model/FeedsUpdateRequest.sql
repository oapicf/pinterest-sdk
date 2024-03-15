--
-- Pinterest REST API.
-- Prepared SQL queries for 'feeds_update_request' definition.
--


--
-- SELECT template for table `feeds_update_request`
--
SELECT `default_currency`, `name`, `format`, `credentials`, `location`, `preferred_processing_schedule`, `status`, `catalog_type`, `default_availability` FROM `feeds_update_request` WHERE 1;

--
-- INSERT template for table `feeds_update_request`
--
INSERT INTO `feeds_update_request`(`default_currency`, `name`, `format`, `credentials`, `location`, `preferred_processing_schedule`, `status`, `catalog_type`, `default_availability`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `feeds_update_request`
--
UPDATE `feeds_update_request` SET `default_currency` = ?, `name` = ?, `format` = ?, `credentials` = ?, `location` = ?, `preferred_processing_schedule` = ?, `status` = ?, `catalog_type` = ?, `default_availability` = ? WHERE 1;

--
-- DELETE template for table `feeds_update_request`
--
DELETE FROM `feeds_update_request` WHERE 0;

