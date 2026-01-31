--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsCreativeAssetsFeedsUpdateRequest' definition.
--


--
-- SELECT template for table `CatalogsCreativeAssetsFeedsUpdateRequest`
--
SELECT `catalog_type`, `credentials`, `default_currency`, `format`, `location`, `name`, `preferred_processing_schedule`, `status` FROM `CatalogsCreativeAssetsFeedsUpdateRequest` WHERE 1;

--
-- INSERT template for table `CatalogsCreativeAssetsFeedsUpdateRequest`
--
INSERT INTO `CatalogsCreativeAssetsFeedsUpdateRequest`(`catalog_type`, `credentials`, `default_currency`, `format`, `location`, `name`, `preferred_processing_schedule`, `status`) VALUES (?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsCreativeAssetsFeedsUpdateRequest`
--
UPDATE `CatalogsCreativeAssetsFeedsUpdateRequest` SET `catalog_type` = ?, `credentials` = ?, `default_currency` = ?, `format` = ?, `location` = ?, `name` = ?, `preferred_processing_schedule` = ?, `status` = ? WHERE 1;

--
-- DELETE template for table `CatalogsCreativeAssetsFeedsUpdateRequest`
--
DELETE FROM `CatalogsCreativeAssetsFeedsUpdateRequest` WHERE 0;

