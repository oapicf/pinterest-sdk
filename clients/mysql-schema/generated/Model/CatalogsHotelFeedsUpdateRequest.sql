--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsHotelFeedsUpdateRequest' definition.
--


--
-- SELECT template for table `CatalogsHotelFeedsUpdateRequest`
--
SELECT `default_currency`, `name`, `format`, `credentials`, `location`, `preferred_processing_schedule`, `status`, `catalog_type` FROM `CatalogsHotelFeedsUpdateRequest` WHERE 1;

--
-- INSERT template for table `CatalogsHotelFeedsUpdateRequest`
--
INSERT INTO `CatalogsHotelFeedsUpdateRequest`(`default_currency`, `name`, `format`, `credentials`, `location`, `preferred_processing_schedule`, `status`, `catalog_type`) VALUES (?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsHotelFeedsUpdateRequest`
--
UPDATE `CatalogsHotelFeedsUpdateRequest` SET `default_currency` = ?, `name` = ?, `format` = ?, `credentials` = ?, `location` = ?, `preferred_processing_schedule` = ?, `status` = ?, `catalog_type` = ? WHERE 1;

--
-- DELETE template for table `CatalogsHotelFeedsUpdateRequest`
--
DELETE FROM `CatalogsHotelFeedsUpdateRequest` WHERE 0;

