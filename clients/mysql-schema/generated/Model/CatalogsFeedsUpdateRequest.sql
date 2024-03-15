--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsFeedsUpdateRequest' definition.
--


--
-- SELECT template for table `CatalogsFeedsUpdateRequest`
--
SELECT `default_availability`, `default_currency`, `name`, `format`, `credentials`, `location`, `preferred_processing_schedule`, `status` FROM `CatalogsFeedsUpdateRequest` WHERE 1;

--
-- INSERT template for table `CatalogsFeedsUpdateRequest`
--
INSERT INTO `CatalogsFeedsUpdateRequest`(`default_availability`, `default_currency`, `name`, `format`, `credentials`, `location`, `preferred_processing_schedule`, `status`) VALUES (?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsFeedsUpdateRequest`
--
UPDATE `CatalogsFeedsUpdateRequest` SET `default_availability` = ?, `default_currency` = ?, `name` = ?, `format` = ?, `credentials` = ?, `location` = ?, `preferred_processing_schedule` = ?, `status` = ? WHERE 1;

--
-- DELETE template for table `CatalogsFeedsUpdateRequest`
--
DELETE FROM `CatalogsFeedsUpdateRequest` WHERE 0;

