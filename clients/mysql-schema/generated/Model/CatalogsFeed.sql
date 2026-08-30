--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsFeed' definition.
--


--
-- SELECT template for table `CatalogsFeed`
--
SELECT `catalog_type`, `created_at`, `credentials`, `default_availability`, `default_country`, `default_currency`, `default_locale`, `format`, `id`, `location`, `name`, `preferred_processing_schedule`, `status`, `updated_at`, `catalog_id` FROM `CatalogsFeed` WHERE 1;

--
-- INSERT template for table `CatalogsFeed`
--
INSERT INTO `CatalogsFeed`(`catalog_type`, `created_at`, `credentials`, `default_availability`, `default_country`, `default_currency`, `default_locale`, `format`, `id`, `location`, `name`, `preferred_processing_schedule`, `status`, `updated_at`, `catalog_id`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsFeed`
--
UPDATE `CatalogsFeed` SET `catalog_type` = ?, `created_at` = ?, `credentials` = ?, `default_availability` = ?, `default_country` = ?, `default_currency` = ?, `default_locale` = ?, `format` = ?, `id` = ?, `location` = ?, `name` = ?, `preferred_processing_schedule` = ?, `status` = ?, `updated_at` = ?, `catalog_id` = ? WHERE 1;

--
-- DELETE template for table `CatalogsFeed`
--
DELETE FROM `CatalogsFeed` WHERE 0;

