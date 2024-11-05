--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsCreativeAssetsFeed' definition.
--


--
-- SELECT template for table `CatalogsCreativeAssetsFeed`
--
SELECT `created_at`, `id`, `updated_at`, `name`, `format`, `catalog_type`, `credentials`, `location`, `preferred_processing_schedule`, `status`, `default_currency`, `default_locale`, `default_country`, `catalog_id` FROM `CatalogsCreativeAssetsFeed` WHERE 1;

--
-- INSERT template for table `CatalogsCreativeAssetsFeed`
--
INSERT INTO `CatalogsCreativeAssetsFeed`(`created_at`, `id`, `updated_at`, `name`, `format`, `catalog_type`, `credentials`, `location`, `preferred_processing_schedule`, `status`, `default_currency`, `default_locale`, `default_country`, `catalog_id`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsCreativeAssetsFeed`
--
UPDATE `CatalogsCreativeAssetsFeed` SET `created_at` = ?, `id` = ?, `updated_at` = ?, `name` = ?, `format` = ?, `catalog_type` = ?, `credentials` = ?, `location` = ?, `preferred_processing_schedule` = ?, `status` = ?, `default_currency` = ?, `default_locale` = ?, `default_country` = ?, `catalog_id` = ? WHERE 1;

--
-- DELETE template for table `CatalogsCreativeAssetsFeed`
--
DELETE FROM `CatalogsCreativeAssetsFeed` WHERE 0;

