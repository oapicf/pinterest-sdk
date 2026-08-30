--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsFeedCreateRequestSchema' definition.
--


--
-- SELECT template for table `CatalogsFeedCreateRequestSchema`
--
SELECT `catalog_id`, `catalog_type`, `credentials`, `default_availability`, `default_country`, `default_currency`, `default_locale`, `format`, `location`, `name`, `preferred_processing_schedule`, `status` FROM `CatalogsFeedCreateRequestSchema` WHERE 1;

--
-- INSERT template for table `CatalogsFeedCreateRequestSchema`
--
INSERT INTO `CatalogsFeedCreateRequestSchema`(`catalog_id`, `catalog_type`, `credentials`, `default_availability`, `default_country`, `default_currency`, `default_locale`, `format`, `location`, `name`, `preferred_processing_schedule`, `status`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsFeedCreateRequestSchema`
--
UPDATE `CatalogsFeedCreateRequestSchema` SET `catalog_id` = ?, `catalog_type` = ?, `credentials` = ?, `default_availability` = ?, `default_country` = ?, `default_currency` = ?, `default_locale` = ?, `format` = ?, `location` = ?, `name` = ?, `preferred_processing_schedule` = ?, `status` = ? WHERE 1;

--
-- DELETE template for table `CatalogsFeedCreateRequestSchema`
--
DELETE FROM `CatalogsFeedCreateRequestSchema` WHERE 0;

