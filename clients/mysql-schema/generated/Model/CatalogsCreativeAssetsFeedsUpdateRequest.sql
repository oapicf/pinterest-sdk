--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsCreativeAssetsFeedsUpdateRequest' definition.
--


--
-- SELECT template for table `CatalogsCreativeAssetsFeedsUpdateRequest`
--
SELECT `default_currency`, `name`, `format`, `credentials`, `location`, `preferred_processing_schedule`, `status`, `catalog_type` FROM `CatalogsCreativeAssetsFeedsUpdateRequest` WHERE 1;

--
-- INSERT template for table `CatalogsCreativeAssetsFeedsUpdateRequest`
--
INSERT INTO `CatalogsCreativeAssetsFeedsUpdateRequest`(`default_currency`, `name`, `format`, `credentials`, `location`, `preferred_processing_schedule`, `status`, `catalog_type`) VALUES (?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsCreativeAssetsFeedsUpdateRequest`
--
UPDATE `CatalogsCreativeAssetsFeedsUpdateRequest` SET `default_currency` = ?, `name` = ?, `format` = ?, `credentials` = ?, `location` = ?, `preferred_processing_schedule` = ?, `status` = ?, `catalog_type` = ? WHERE 1;

--
-- DELETE template for table `CatalogsCreativeAssetsFeedsUpdateRequest`
--
DELETE FROM `CatalogsCreativeAssetsFeedsUpdateRequest` WHERE 0;

