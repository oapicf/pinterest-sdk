--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsVerticalFeedsCreateRequest' definition.
--


--
-- SELECT template for table `CatalogsVerticalFeedsCreateRequest`
--
SELECT `default_currency`, `name`, `format`, `default_locale`, `credentials`, `location`, `preferred_processing_schedule`, `catalog_type`, `default_country`, `default_availability`, `status`, `catalog_id` FROM `CatalogsVerticalFeedsCreateRequest` WHERE 1;

--
-- INSERT template for table `CatalogsVerticalFeedsCreateRequest`
--
INSERT INTO `CatalogsVerticalFeedsCreateRequest`(`default_currency`, `name`, `format`, `default_locale`, `credentials`, `location`, `preferred_processing_schedule`, `catalog_type`, `default_country`, `default_availability`, `status`, `catalog_id`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsVerticalFeedsCreateRequest`
--
UPDATE `CatalogsVerticalFeedsCreateRequest` SET `default_currency` = ?, `name` = ?, `format` = ?, `default_locale` = ?, `credentials` = ?, `location` = ?, `preferred_processing_schedule` = ?, `catalog_type` = ?, `default_country` = ?, `default_availability` = ?, `status` = ?, `catalog_id` = ? WHERE 1;

--
-- DELETE template for table `CatalogsVerticalFeedsCreateRequest`
--
DELETE FROM `CatalogsVerticalFeedsCreateRequest` WHERE 0;

