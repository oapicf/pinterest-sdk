--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsHotelFeed' definition.
--


--
-- SELECT template for table `CatalogsHotelFeed`
--
SELECT `created_at`, `id`, `updated_at`, `name`, `format`, `catalog_type`, `credentials`, `location`, `preferred_processing_schedule`, `status`, `default_currency`, `default_locale`, `catalog_id` FROM `CatalogsHotelFeed` WHERE 1;

--
-- INSERT template for table `CatalogsHotelFeed`
--
INSERT INTO `CatalogsHotelFeed`(`created_at`, `id`, `updated_at`, `name`, `format`, `catalog_type`, `credentials`, `location`, `preferred_processing_schedule`, `status`, `default_currency`, `default_locale`, `catalog_id`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsHotelFeed`
--
UPDATE `CatalogsHotelFeed` SET `created_at` = ?, `id` = ?, `updated_at` = ?, `name` = ?, `format` = ?, `catalog_type` = ?, `credentials` = ?, `location` = ?, `preferred_processing_schedule` = ?, `status` = ?, `default_currency` = ?, `default_locale` = ?, `catalog_id` = ? WHERE 1;

--
-- DELETE template for table `CatalogsHotelFeed`
--
DELETE FROM `CatalogsHotelFeed` WHERE 0;

