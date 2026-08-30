--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsHotelFeed' definition.
--


--
-- SELECT template for table `CatalogsHotelFeed`
--
SELECT `catalog_id`, `catalog_type`, `created_at`, `credentials`, `default_currency`, `default_locale`, `format`, `id`, `location`, `name`, `preferred_processing_schedule`, `status`, `updated_at` FROM `CatalogsHotelFeed` WHERE 1;

--
-- INSERT template for table `CatalogsHotelFeed`
--
INSERT INTO `CatalogsHotelFeed`(`catalog_id`, `catalog_type`, `created_at`, `credentials`, `default_currency`, `default_locale`, `format`, `id`, `location`, `name`, `preferred_processing_schedule`, `status`, `updated_at`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsHotelFeed`
--
UPDATE `CatalogsHotelFeed` SET `catalog_id` = ?, `catalog_type` = ?, `created_at` = ?, `credentials` = ?, `default_currency` = ?, `default_locale` = ?, `format` = ?, `id` = ?, `location` = ?, `name` = ?, `preferred_processing_schedule` = ?, `status` = ?, `updated_at` = ? WHERE 1;

--
-- DELETE template for table `CatalogsHotelFeed`
--
DELETE FROM `CatalogsHotelFeed` WHERE 0;

