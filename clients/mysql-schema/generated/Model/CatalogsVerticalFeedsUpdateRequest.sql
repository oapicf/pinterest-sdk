--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsVerticalFeedsUpdateRequest' definition.
--


--
-- SELECT template for table `CatalogsVerticalFeedsUpdateRequest`
--
SELECT `default_currency`, `name`, `format`, `credentials`, `location`, `preferred_processing_schedule`, `status`, `catalog_type`, `default_availability` FROM `CatalogsVerticalFeedsUpdateRequest` WHERE 1;

--
-- INSERT template for table `CatalogsVerticalFeedsUpdateRequest`
--
INSERT INTO `CatalogsVerticalFeedsUpdateRequest`(`default_currency`, `name`, `format`, `credentials`, `location`, `preferred_processing_schedule`, `status`, `catalog_type`, `default_availability`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsVerticalFeedsUpdateRequest`
--
UPDATE `CatalogsVerticalFeedsUpdateRequest` SET `default_currency` = ?, `name` = ?, `format` = ?, `credentials` = ?, `location` = ?, `preferred_processing_schedule` = ?, `status` = ?, `catalog_type` = ?, `default_availability` = ? WHERE 1;

--
-- DELETE template for table `CatalogsVerticalFeedsUpdateRequest`
--
DELETE FROM `CatalogsVerticalFeedsUpdateRequest` WHERE 0;

