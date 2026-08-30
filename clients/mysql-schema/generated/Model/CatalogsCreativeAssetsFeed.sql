--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsCreativeAssetsFeed' definition.
--


--
-- SELECT template for table `CatalogsCreativeAssetsFeed`
--
SELECT `catalog_id`, `catalog_type`, `created_at`, `credentials`, `default_country`, `default_currency`, `default_locale`, `format`, `id`, `location`, `name`, `preferred_processing_schedule`, `status`, `updated_at` FROM `CatalogsCreativeAssetsFeed` WHERE 1;

--
-- INSERT template for table `CatalogsCreativeAssetsFeed`
--
INSERT INTO `CatalogsCreativeAssetsFeed`(`catalog_id`, `catalog_type`, `created_at`, `credentials`, `default_country`, `default_currency`, `default_locale`, `format`, `id`, `location`, `name`, `preferred_processing_schedule`, `status`, `updated_at`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsCreativeAssetsFeed`
--
UPDATE `CatalogsCreativeAssetsFeed` SET `catalog_id` = ?, `catalog_type` = ?, `created_at` = ?, `credentials` = ?, `default_country` = ?, `default_currency` = ?, `default_locale` = ?, `format` = ?, `id` = ?, `location` = ?, `name` = ?, `preferred_processing_schedule` = ?, `status` = ?, `updated_at` = ? WHERE 1;

--
-- DELETE template for table `CatalogsCreativeAssetsFeed`
--
DELETE FROM `CatalogsCreativeAssetsFeed` WHERE 0;

