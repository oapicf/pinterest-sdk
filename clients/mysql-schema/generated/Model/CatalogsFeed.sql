--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsFeed' definition.
--


--
-- SELECT template for table `CatalogsFeed`
--
SELECT `created_at`, `id`, `updated_at`, `catalog_type`, `credentials`, `default_availability`, `default_country`, `default_currency`, `default_locale`, `format`, `location`, `name`, `preferred_processing_schedule`, `status`, `catalog_id` FROM `CatalogsFeed` WHERE 1;

--
-- INSERT template for table `CatalogsFeed`
--
INSERT INTO `CatalogsFeed`(`created_at`, `id`, `updated_at`, `catalog_type`, `credentials`, `default_availability`, `default_country`, `default_currency`, `default_locale`, `format`, `location`, `name`, `preferred_processing_schedule`, `status`, `catalog_id`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsFeed`
--
UPDATE `CatalogsFeed` SET `created_at` = ?, `id` = ?, `updated_at` = ?, `catalog_type` = ?, `credentials` = ?, `default_availability` = ?, `default_country` = ?, `default_currency` = ?, `default_locale` = ?, `format` = ?, `location` = ?, `name` = ?, `preferred_processing_schedule` = ?, `status` = ?, `catalog_id` = ? WHERE 1;

--
-- DELETE template for table `CatalogsFeed`
--
DELETE FROM `CatalogsFeed` WHERE 0;

