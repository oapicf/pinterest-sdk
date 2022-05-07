--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsFeed' definition.
--


--
-- SELECT template for table `CatalogsFeed`
--
SELECT `created_at`, `id`, `updated_at`, `default_country`, `default_availability`, `default_currency`, `name`, `format`, `default_locale`, `credentials`, `location`, `preferred_processing_schedule`, `status` FROM `CatalogsFeed` WHERE 1;

--
-- INSERT template for table `CatalogsFeed`
--
INSERT INTO `CatalogsFeed`(`created_at`, `id`, `updated_at`, `default_country`, `default_availability`, `default_currency`, `name`, `format`, `default_locale`, `credentials`, `location`, `preferred_processing_schedule`, `status`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsFeed`
--
UPDATE `CatalogsFeed` SET `created_at` = ?, `id` = ?, `updated_at` = ?, `default_country` = ?, `default_availability` = ?, `default_currency` = ?, `name` = ?, `format` = ?, `default_locale` = ?, `credentials` = ?, `location` = ?, `preferred_processing_schedule` = ?, `status` = ? WHERE 1;

--
-- DELETE template for table `CatalogsFeed`
--
DELETE FROM `CatalogsFeed` WHERE 0;

