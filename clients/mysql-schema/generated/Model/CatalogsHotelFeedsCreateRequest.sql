--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsHotelFeedsCreateRequest' definition.
--


--
-- SELECT template for table `CatalogsHotelFeedsCreateRequest`
--
SELECT `default_currency`, `name`, `format`, `default_locale`, `credentials`, `location`, `preferred_processing_schedule`, `catalog_type`, `catalog_id` FROM `CatalogsHotelFeedsCreateRequest` WHERE 1;

--
-- INSERT template for table `CatalogsHotelFeedsCreateRequest`
--
INSERT INTO `CatalogsHotelFeedsCreateRequest`(`default_currency`, `name`, `format`, `default_locale`, `credentials`, `location`, `preferred_processing_schedule`, `catalog_type`, `catalog_id`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsHotelFeedsCreateRequest`
--
UPDATE `CatalogsHotelFeedsCreateRequest` SET `default_currency` = ?, `name` = ?, `format` = ?, `default_locale` = ?, `credentials` = ?, `location` = ?, `preferred_processing_schedule` = ?, `catalog_type` = ?, `catalog_id` = ? WHERE 1;

--
-- DELETE template for table `CatalogsHotelFeedsCreateRequest`
--
DELETE FROM `CatalogsHotelFeedsCreateRequest` WHERE 0;

