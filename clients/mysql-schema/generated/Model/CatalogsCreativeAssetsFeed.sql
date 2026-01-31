--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsCreativeAssetsFeed' definition.
--


--
-- SELECT template for table `CatalogsCreativeAssetsFeed`
--
SELECT `created_at`, `id`, `updated_at`, `catalog_id`, `catalog_type`, `credentials`, `default_country`, `default_currency`, `default_locale`, `format`, `location`, `name`, `preferred_processing_schedule`, `status` FROM `CatalogsCreativeAssetsFeed` WHERE 1;

--
-- INSERT template for table `CatalogsCreativeAssetsFeed`
--
INSERT INTO `CatalogsCreativeAssetsFeed`(`created_at`, `id`, `updated_at`, `catalog_id`, `catalog_type`, `credentials`, `default_country`, `default_currency`, `default_locale`, `format`, `location`, `name`, `preferred_processing_schedule`, `status`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsCreativeAssetsFeed`
--
UPDATE `CatalogsCreativeAssetsFeed` SET `created_at` = ?, `id` = ?, `updated_at` = ?, `catalog_id` = ?, `catalog_type` = ?, `credentials` = ?, `default_country` = ?, `default_currency` = ?, `default_locale` = ?, `format` = ?, `location` = ?, `name` = ?, `preferred_processing_schedule` = ?, `status` = ? WHERE 1;

--
-- DELETE template for table `CatalogsCreativeAssetsFeed`
--
DELETE FROM `CatalogsCreativeAssetsFeed` WHERE 0;

