--
-- Pinterest REST API.
-- Prepared SQL queries for 'feeds_create_request' definition.
--


--
-- SELECT template for table `feeds_create_request`
--
SELECT `catalog_id`, `catalog_type`, `credentials`, `default_availability`, `default_country`, `default_currency`, `default_locale`, `format`, `location`, `name`, `preferred_processing_schedule`, `status` FROM `feeds_create_request` WHERE 1;

--
-- INSERT template for table `feeds_create_request`
--
INSERT INTO `feeds_create_request`(`catalog_id`, `catalog_type`, `credentials`, `default_availability`, `default_country`, `default_currency`, `default_locale`, `format`, `location`, `name`, `preferred_processing_schedule`, `status`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `feeds_create_request`
--
UPDATE `feeds_create_request` SET `catalog_id` = ?, `catalog_type` = ?, `credentials` = ?, `default_availability` = ?, `default_country` = ?, `default_currency` = ?, `default_locale` = ?, `format` = ?, `location` = ?, `name` = ?, `preferred_processing_schedule` = ?, `status` = ? WHERE 1;

--
-- DELETE template for table `feeds_create_request`
--
DELETE FROM `feeds_create_request` WHERE 0;

