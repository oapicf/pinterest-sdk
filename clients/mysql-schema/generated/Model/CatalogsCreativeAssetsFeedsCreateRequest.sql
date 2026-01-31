--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsCreativeAssetsFeedsCreateRequest' definition.
--


--
-- SELECT template for table `CatalogsCreativeAssetsFeedsCreateRequest`
--
SELECT `catalog_id`, `catalog_type`, `credentials`, `default_country`, `default_currency`, `default_locale`, `format`, `location`, `name`, `preferred_processing_schedule`, `status` FROM `CatalogsCreativeAssetsFeedsCreateRequest` WHERE 1;

--
-- INSERT template for table `CatalogsCreativeAssetsFeedsCreateRequest`
--
INSERT INTO `CatalogsCreativeAssetsFeedsCreateRequest`(`catalog_id`, `catalog_type`, `credentials`, `default_country`, `default_currency`, `default_locale`, `format`, `location`, `name`, `preferred_processing_schedule`, `status`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsCreativeAssetsFeedsCreateRequest`
--
UPDATE `CatalogsCreativeAssetsFeedsCreateRequest` SET `catalog_id` = ?, `catalog_type` = ?, `credentials` = ?, `default_country` = ?, `default_currency` = ?, `default_locale` = ?, `format` = ?, `location` = ?, `name` = ?, `preferred_processing_schedule` = ?, `status` = ? WHERE 1;

--
-- DELETE template for table `CatalogsCreativeAssetsFeedsCreateRequest`
--
DELETE FROM `CatalogsCreativeAssetsFeedsCreateRequest` WHERE 0;

