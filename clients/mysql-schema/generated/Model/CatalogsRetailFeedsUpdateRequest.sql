--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsRetailFeedsUpdateRequest' definition.
--


--
-- SELECT template for table `CatalogsRetailFeedsUpdateRequest`
--
SELECT `catalog_type`, `credentials`, `default_availability`, `default_currency`, `format`, `location`, `name`, `preferred_processing_schedule`, `status` FROM `CatalogsRetailFeedsUpdateRequest` WHERE 1;

--
-- INSERT template for table `CatalogsRetailFeedsUpdateRequest`
--
INSERT INTO `CatalogsRetailFeedsUpdateRequest`(`catalog_type`, `credentials`, `default_availability`, `default_currency`, `format`, `location`, `name`, `preferred_processing_schedule`, `status`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsRetailFeedsUpdateRequest`
--
UPDATE `CatalogsRetailFeedsUpdateRequest` SET `catalog_type` = ?, `credentials` = ?, `default_availability` = ?, `default_currency` = ?, `format` = ?, `location` = ?, `name` = ?, `preferred_processing_schedule` = ?, `status` = ? WHERE 1;

--
-- DELETE template for table `CatalogsRetailFeedsUpdateRequest`
--
DELETE FROM `CatalogsRetailFeedsUpdateRequest` WHERE 0;

