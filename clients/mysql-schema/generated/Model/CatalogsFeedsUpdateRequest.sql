--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsFeedsUpdateRequest' definition.
--


--
-- SELECT template for table `CatalogsFeedsUpdateRequest`
--
SELECT `credentials`, `default_availability`, `default_currency`, `format`, `location`, `name`, `preferred_processing_schedule`, `status` FROM `CatalogsFeedsUpdateRequest` WHERE 1;

--
-- INSERT template for table `CatalogsFeedsUpdateRequest`
--
INSERT INTO `CatalogsFeedsUpdateRequest`(`credentials`, `default_availability`, `default_currency`, `format`, `location`, `name`, `preferred_processing_schedule`, `status`) VALUES (?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsFeedsUpdateRequest`
--
UPDATE `CatalogsFeedsUpdateRequest` SET `credentials` = ?, `default_availability` = ?, `default_currency` = ?, `format` = ?, `location` = ?, `name` = ?, `preferred_processing_schedule` = ?, `status` = ? WHERE 1;

--
-- DELETE template for table `CatalogsFeedsUpdateRequest`
--
DELETE FROM `CatalogsFeedsUpdateRequest` WHERE 0;

