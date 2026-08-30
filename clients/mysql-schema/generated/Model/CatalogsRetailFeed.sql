--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsRetailFeed' definition.
--


--
-- SELECT template for table `CatalogsRetailFeed`
--
SELECT `catalog_type`, `created_at`, `credentials`, `default_availability`, `default_country`, `default_currency`, `default_locale`, `format`, `id`, `location`, `name`, `preferred_processing_schedule`, `status`, `updated_at` FROM `CatalogsRetailFeed` WHERE 1;

--
-- INSERT template for table `CatalogsRetailFeed`
--
INSERT INTO `CatalogsRetailFeed`(`catalog_type`, `created_at`, `credentials`, `default_availability`, `default_country`, `default_currency`, `default_locale`, `format`, `id`, `location`, `name`, `preferred_processing_schedule`, `status`, `updated_at`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsRetailFeed`
--
UPDATE `CatalogsRetailFeed` SET `catalog_type` = ?, `created_at` = ?, `credentials` = ?, `default_availability` = ?, `default_country` = ?, `default_currency` = ?, `default_locale` = ?, `format` = ?, `id` = ?, `location` = ?, `name` = ?, `preferred_processing_schedule` = ?, `status` = ?, `updated_at` = ? WHERE 1;

--
-- DELETE template for table `CatalogsRetailFeed`
--
DELETE FROM `CatalogsRetailFeed` WHERE 0;

