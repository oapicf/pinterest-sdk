--
-- Pinterest REST API.
-- Prepared SQL queries for 'feeds_create_request' definition.
--


--
-- SELECT template for table `feeds_create_request`
--
SELECT `default_currency`, `name`, `format`, `default_locale`, `credentials`, `location`, `preferred_processing_schedule`, `catalog_type`, `default_country`, `default_availability`, `catalog_id` FROM `feeds_create_request` WHERE 1;

--
-- INSERT template for table `feeds_create_request`
--
INSERT INTO `feeds_create_request`(`default_currency`, `name`, `format`, `default_locale`, `credentials`, `location`, `preferred_processing_schedule`, `catalog_type`, `default_country`, `default_availability`, `catalog_id`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `feeds_create_request`
--
UPDATE `feeds_create_request` SET `default_currency` = ?, `name` = ?, `format` = ?, `default_locale` = ?, `credentials` = ?, `location` = ?, `preferred_processing_schedule` = ?, `catalog_type` = ?, `default_country` = ?, `default_availability` = ?, `catalog_id` = ? WHERE 1;

--
-- DELETE template for table `feeds_create_request`
--
DELETE FROM `feeds_create_request` WHERE 0;

