--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsCreativeAssetsFeedsCreateRequest' definition.
--


--
-- SELECT template for table `CatalogsCreativeAssetsFeedsCreateRequest`
--
SELECT `default_currency`, `name`, `format`, `default_locale`, `default_country`, `credentials`, `location`, `preferred_processing_schedule`, `catalog_type`, `catalog_id`, `status` FROM `CatalogsCreativeAssetsFeedsCreateRequest` WHERE 1;

--
-- INSERT template for table `CatalogsCreativeAssetsFeedsCreateRequest`
--
INSERT INTO `CatalogsCreativeAssetsFeedsCreateRequest`(`default_currency`, `name`, `format`, `default_locale`, `default_country`, `credentials`, `location`, `preferred_processing_schedule`, `catalog_type`, `catalog_id`, `status`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsCreativeAssetsFeedsCreateRequest`
--
UPDATE `CatalogsCreativeAssetsFeedsCreateRequest` SET `default_currency` = ?, `name` = ?, `format` = ?, `default_locale` = ?, `default_country` = ?, `credentials` = ?, `location` = ?, `preferred_processing_schedule` = ?, `catalog_type` = ?, `catalog_id` = ?, `status` = ? WHERE 1;

--
-- DELETE template for table `CatalogsCreativeAssetsFeedsCreateRequest`
--
DELETE FROM `CatalogsCreativeAssetsFeedsCreateRequest` WHERE 0;

