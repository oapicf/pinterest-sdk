--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsVerticalFeedsUpdateRequest' definition.
--


--
-- SELECT template for table `CatalogsVerticalFeedsUpdateRequest`
--
SELECT `catalog_type`, `credentials`, `default_availability`, `default_currency`, `format`, `location`, `name`, `preferred_processing_schedule`, `status` FROM `CatalogsVerticalFeedsUpdateRequest` WHERE 1;

--
-- INSERT template for table `CatalogsVerticalFeedsUpdateRequest`
--
INSERT INTO `CatalogsVerticalFeedsUpdateRequest`(`catalog_type`, `credentials`, `default_availability`, `default_currency`, `format`, `location`, `name`, `preferred_processing_schedule`, `status`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsVerticalFeedsUpdateRequest`
--
UPDATE `CatalogsVerticalFeedsUpdateRequest` SET `catalog_type` = ?, `credentials` = ?, `default_availability` = ?, `default_currency` = ?, `format` = ?, `location` = ?, `name` = ?, `preferred_processing_schedule` = ?, `status` = ? WHERE 1;

--
-- DELETE template for table `CatalogsVerticalFeedsUpdateRequest`
--
DELETE FROM `CatalogsVerticalFeedsUpdateRequest` WHERE 0;

