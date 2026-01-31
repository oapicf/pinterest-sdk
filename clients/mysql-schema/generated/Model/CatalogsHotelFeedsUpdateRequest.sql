--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsHotelFeedsUpdateRequest' definition.
--


--
-- SELECT template for table `CatalogsHotelFeedsUpdateRequest`
--
SELECT `catalog_type`, `credentials`, `default_currency`, `format`, `location`, `name`, `preferred_processing_schedule`, `status` FROM `CatalogsHotelFeedsUpdateRequest` WHERE 1;

--
-- INSERT template for table `CatalogsHotelFeedsUpdateRequest`
--
INSERT INTO `CatalogsHotelFeedsUpdateRequest`(`catalog_type`, `credentials`, `default_currency`, `format`, `location`, `name`, `preferred_processing_schedule`, `status`) VALUES (?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsHotelFeedsUpdateRequest`
--
UPDATE `CatalogsHotelFeedsUpdateRequest` SET `catalog_type` = ?, `credentials` = ?, `default_currency` = ?, `format` = ?, `location` = ?, `name` = ?, `preferred_processing_schedule` = ?, `status` = ? WHERE 1;

--
-- DELETE template for table `CatalogsHotelFeedsUpdateRequest`
--
DELETE FROM `CatalogsHotelFeedsUpdateRequest` WHERE 0;

