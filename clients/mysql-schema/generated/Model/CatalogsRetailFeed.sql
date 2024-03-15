--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsRetailFeed' definition.
--


--
-- SELECT template for table `CatalogsRetailFeed`
--
SELECT `created_at`, `id`, `updated_at`, `name`, `format`, `catalog_type`, `credentials`, `location`, `preferred_processing_schedule`, `status`, `default_currency`, `default_locale`, `default_country`, `default_availability` FROM `CatalogsRetailFeed` WHERE 1;

--
-- INSERT template for table `CatalogsRetailFeed`
--
INSERT INTO `CatalogsRetailFeed`(`created_at`, `id`, `updated_at`, `name`, `format`, `catalog_type`, `credentials`, `location`, `preferred_processing_schedule`, `status`, `default_currency`, `default_locale`, `default_country`, `default_availability`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsRetailFeed`
--
UPDATE `CatalogsRetailFeed` SET `created_at` = ?, `id` = ?, `updated_at` = ?, `name` = ?, `format` = ?, `catalog_type` = ?, `credentials` = ?, `location` = ?, `preferred_processing_schedule` = ?, `status` = ?, `default_currency` = ?, `default_locale` = ?, `default_country` = ?, `default_availability` = ? WHERE 1;

--
-- DELETE template for table `CatalogsRetailFeed`
--
DELETE FROM `CatalogsRetailFeed` WHERE 0;

