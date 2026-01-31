--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsFeedsCreateRequest' definition.
--


--
-- SELECT template for table `CatalogsFeedsCreateRequest`
--
SELECT `credentials`, `default_availability`, `default_country`, `default_currency`, `default_locale`, `format`, `location`, `name`, `preferred_processing_schedule`, `status` FROM `CatalogsFeedsCreateRequest` WHERE 1;

--
-- INSERT template for table `CatalogsFeedsCreateRequest`
--
INSERT INTO `CatalogsFeedsCreateRequest`(`credentials`, `default_availability`, `default_country`, `default_currency`, `default_locale`, `format`, `location`, `name`, `preferred_processing_schedule`, `status`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsFeedsCreateRequest`
--
UPDATE `CatalogsFeedsCreateRequest` SET `credentials` = ?, `default_availability` = ?, `default_country` = ?, `default_currency` = ?, `default_locale` = ?, `format` = ?, `location` = ?, `name` = ?, `preferred_processing_schedule` = ?, `status` = ? WHERE 1;

--
-- DELETE template for table `CatalogsFeedsCreateRequest`
--
DELETE FROM `CatalogsFeedsCreateRequest` WHERE 0;

