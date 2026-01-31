--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsRetailFeedsCreateRequest' definition.
--


--
-- SELECT template for table `CatalogsRetailFeedsCreateRequest`
--
SELECT `catalog_id`, `catalog_type`, `credentials`, `default_availability`, `default_country`, `default_currency`, `default_locale`, `format`, `location`, `name`, `preferred_processing_schedule`, `status` FROM `CatalogsRetailFeedsCreateRequest` WHERE 1;

--
-- INSERT template for table `CatalogsRetailFeedsCreateRequest`
--
INSERT INTO `CatalogsRetailFeedsCreateRequest`(`catalog_id`, `catalog_type`, `credentials`, `default_availability`, `default_country`, `default_currency`, `default_locale`, `format`, `location`, `name`, `preferred_processing_schedule`, `status`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsRetailFeedsCreateRequest`
--
UPDATE `CatalogsRetailFeedsCreateRequest` SET `catalog_id` = ?, `catalog_type` = ?, `credentials` = ?, `default_availability` = ?, `default_country` = ?, `default_currency` = ?, `default_locale` = ?, `format` = ?, `location` = ?, `name` = ?, `preferred_processing_schedule` = ?, `status` = ? WHERE 1;

--
-- DELETE template for table `CatalogsRetailFeedsCreateRequest`
--
DELETE FROM `CatalogsRetailFeedsCreateRequest` WHERE 0;

