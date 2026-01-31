--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsHotelFeedsCreateRequest' definition.
--


--
-- SELECT template for table `CatalogsHotelFeedsCreateRequest`
--
SELECT `catalog_id`, `catalog_type`, `credentials`, `default_currency`, `default_locale`, `format`, `location`, `name`, `preferred_processing_schedule`, `status` FROM `CatalogsHotelFeedsCreateRequest` WHERE 1;

--
-- INSERT template for table `CatalogsHotelFeedsCreateRequest`
--
INSERT INTO `CatalogsHotelFeedsCreateRequest`(`catalog_id`, `catalog_type`, `credentials`, `default_currency`, `default_locale`, `format`, `location`, `name`, `preferred_processing_schedule`, `status`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsHotelFeedsCreateRequest`
--
UPDATE `CatalogsHotelFeedsCreateRequest` SET `catalog_id` = ?, `catalog_type` = ?, `credentials` = ?, `default_currency` = ?, `default_locale` = ?, `format` = ?, `location` = ?, `name` = ?, `preferred_processing_schedule` = ?, `status` = ? WHERE 1;

--
-- DELETE template for table `CatalogsHotelFeedsCreateRequest`
--
DELETE FROM `CatalogsHotelFeedsCreateRequest` WHERE 0;

