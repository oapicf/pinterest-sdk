--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsRetailFeed' definition.
--


--
-- SELECT template for table `CatalogsRetailFeed`
--
SELECT `created_at`, `id`, `updated_at`, `catalog_type`, `credentials`, `default_availability`, `default_country`, `default_currency`, `default_locale`, `format`, `location`, `name`, `preferred_processing_schedule`, `status` FROM `CatalogsRetailFeed` WHERE 1;

--
-- INSERT template for table `CatalogsRetailFeed`
--
INSERT INTO `CatalogsRetailFeed`(`created_at`, `id`, `updated_at`, `catalog_type`, `credentials`, `default_availability`, `default_country`, `default_currency`, `default_locale`, `format`, `location`, `name`, `preferred_processing_schedule`, `status`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsRetailFeed`
--
UPDATE `CatalogsRetailFeed` SET `created_at` = ?, `id` = ?, `updated_at` = ?, `catalog_type` = ?, `credentials` = ?, `default_availability` = ?, `default_country` = ?, `default_currency` = ?, `default_locale` = ?, `format` = ?, `location` = ?, `name` = ?, `preferred_processing_schedule` = ?, `status` = ? WHERE 1;

--
-- DELETE template for table `CatalogsRetailFeed`
--
DELETE FROM `CatalogsRetailFeed` WHERE 0;

