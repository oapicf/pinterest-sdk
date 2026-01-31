--
-- Pinterest REST API.
-- Prepared SQL queries for 'feeds_update_request' definition.
--


--
-- SELECT template for table `feeds_update_request`
--
SELECT `catalog_type`, `credentials`, `default_availability`, `default_currency`, `format`, `location`, `name`, `preferred_processing_schedule`, `status` FROM `feeds_update_request` WHERE 1;

--
-- INSERT template for table `feeds_update_request`
--
INSERT INTO `feeds_update_request`(`catalog_type`, `credentials`, `default_availability`, `default_currency`, `format`, `location`, `name`, `preferred_processing_schedule`, `status`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `feeds_update_request`
--
UPDATE `feeds_update_request` SET `catalog_type` = ?, `credentials` = ?, `default_availability` = ?, `default_currency` = ?, `format` = ?, `location` = ?, `name` = ?, `preferred_processing_schedule` = ?, `status` = ? WHERE 1;

--
-- DELETE template for table `feeds_update_request`
--
DELETE FROM `feeds_update_request` WHERE 0;

