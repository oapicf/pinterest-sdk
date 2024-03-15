--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsFeed' definition.
--


--
-- SELECT template for table `CatalogsFeed`
--
SELECT `created_at`, `id`, `updated_at`, `name`, `format`, `catalog_type`, `credentials`, `location`, `preferred_processing_schedule`, `status`, `default_currency`, `default_locale`, `default_country`, `default_availability`, `catalog_id` FROM `CatalogsFeed` WHERE 1;

--
-- INSERT template for table `CatalogsFeed`
--
INSERT INTO `CatalogsFeed`(`created_at`, `id`, `updated_at`, `name`, `format`, `catalog_type`, `credentials`, `location`, `preferred_processing_schedule`, `status`, `default_currency`, `default_locale`, `default_country`, `default_availability`, `catalog_id`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsFeed`
--
UPDATE `CatalogsFeed` SET `created_at` = ?, `id` = ?, `updated_at` = ?, `name` = ?, `format` = ?, `catalog_type` = ?, `credentials` = ?, `location` = ?, `preferred_processing_schedule` = ?, `status` = ?, `default_currency` = ?, `default_locale` = ?, `default_country` = ?, `default_availability` = ?, `catalog_id` = ? WHERE 1;

--
-- DELETE template for table `CatalogsFeed`
--
DELETE FROM `CatalogsFeed` WHERE 0;

