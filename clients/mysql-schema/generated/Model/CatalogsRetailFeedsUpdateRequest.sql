--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsRetailFeedsUpdateRequest' definition.
--


--
-- SELECT template for table `CatalogsRetailFeedsUpdateRequest`
--
SELECT `default_currency`, `name`, `format`, `credentials`, `location`, `preferred_processing_schedule`, `status`, `catalog_type`, `default_availability` FROM `CatalogsRetailFeedsUpdateRequest` WHERE 1;

--
-- INSERT template for table `CatalogsRetailFeedsUpdateRequest`
--
INSERT INTO `CatalogsRetailFeedsUpdateRequest`(`default_currency`, `name`, `format`, `credentials`, `location`, `preferred_processing_schedule`, `status`, `catalog_type`, `default_availability`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsRetailFeedsUpdateRequest`
--
UPDATE `CatalogsRetailFeedsUpdateRequest` SET `default_currency` = ?, `name` = ?, `format` = ?, `credentials` = ?, `location` = ?, `preferred_processing_schedule` = ?, `status` = ?, `catalog_type` = ?, `default_availability` = ? WHERE 1;

--
-- DELETE template for table `CatalogsRetailFeedsUpdateRequest`
--
DELETE FROM `CatalogsRetailFeedsUpdateRequest` WHERE 0;

