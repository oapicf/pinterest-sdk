--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsFeedUpdateRequestSchema' definition.
--


--
-- SELECT template for table `CatalogsFeedUpdateRequestSchema`
--
SELECT `catalog_type`, `credentials`, `default_availability`, `default_currency`, `format`, `location`, `name`, `preferred_processing_schedule`, `status` FROM `CatalogsFeedUpdateRequestSchema` WHERE 1;

--
-- INSERT template for table `CatalogsFeedUpdateRequestSchema`
--
INSERT INTO `CatalogsFeedUpdateRequestSchema`(`catalog_type`, `credentials`, `default_availability`, `default_currency`, `format`, `location`, `name`, `preferred_processing_schedule`, `status`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsFeedUpdateRequestSchema`
--
UPDATE `CatalogsFeedUpdateRequestSchema` SET `catalog_type` = ?, `credentials` = ?, `default_availability` = ?, `default_currency` = ?, `format` = ?, `location` = ?, `name` = ?, `preferred_processing_schedule` = ?, `status` = ? WHERE 1;

--
-- DELETE template for table `CatalogsFeedUpdateRequestSchema`
--
DELETE FROM `CatalogsFeedUpdateRequestSchema` WHERE 0;

