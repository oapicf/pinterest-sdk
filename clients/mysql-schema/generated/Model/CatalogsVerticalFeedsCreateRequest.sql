--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsVerticalFeedsCreateRequest' definition.
--


--
-- SELECT template for table `CatalogsVerticalFeedsCreateRequest`
--
SELECT `catalog_id`, `catalog_type`, `credentials`, `default_availability`, `default_country`, `default_currency`, `default_locale`, `format`, `location`, `name`, `preferred_processing_schedule`, `status` FROM `CatalogsVerticalFeedsCreateRequest` WHERE 1;

--
-- INSERT template for table `CatalogsVerticalFeedsCreateRequest`
--
INSERT INTO `CatalogsVerticalFeedsCreateRequest`(`catalog_id`, `catalog_type`, `credentials`, `default_availability`, `default_country`, `default_currency`, `default_locale`, `format`, `location`, `name`, `preferred_processing_schedule`, `status`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsVerticalFeedsCreateRequest`
--
UPDATE `CatalogsVerticalFeedsCreateRequest` SET `catalog_id` = ?, `catalog_type` = ?, `credentials` = ?, `default_availability` = ?, `default_country` = ?, `default_currency` = ?, `default_locale` = ?, `format` = ?, `location` = ?, `name` = ?, `preferred_processing_schedule` = ?, `status` = ? WHERE 1;

--
-- DELETE template for table `CatalogsVerticalFeedsCreateRequest`
--
DELETE FROM `CatalogsVerticalFeedsCreateRequest` WHERE 0;

