--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsRetailFeedsCreateRequest' definition.
--


--
-- SELECT template for table `CatalogsRetailFeedsCreateRequest`
--
SELECT `default_currency`, `name`, `format`, `default_locale`, `credentials`, `location`, `preferred_processing_schedule`, `catalog_type`, `default_country`, `default_availability` FROM `CatalogsRetailFeedsCreateRequest` WHERE 1;

--
-- INSERT template for table `CatalogsRetailFeedsCreateRequest`
--
INSERT INTO `CatalogsRetailFeedsCreateRequest`(`default_currency`, `name`, `format`, `default_locale`, `credentials`, `location`, `preferred_processing_schedule`, `catalog_type`, `default_country`, `default_availability`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsRetailFeedsCreateRequest`
--
UPDATE `CatalogsRetailFeedsCreateRequest` SET `default_currency` = ?, `name` = ?, `format` = ?, `default_locale` = ?, `credentials` = ?, `location` = ?, `preferred_processing_schedule` = ?, `catalog_type` = ?, `default_country` = ?, `default_availability` = ? WHERE 1;

--
-- DELETE template for table `CatalogsRetailFeedsCreateRequest`
--
DELETE FROM `CatalogsRetailFeedsCreateRequest` WHERE 0;

