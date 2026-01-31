--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsHotelFeed' definition.
--


--
-- SELECT template for table `CatalogsHotelFeed`
--
SELECT `created_at`, `id`, `updated_at`, `catalog_id`, `catalog_type`, `credentials`, `default_currency`, `default_locale`, `format`, `location`, `name`, `preferred_processing_schedule`, `status` FROM `CatalogsHotelFeed` WHERE 1;

--
-- INSERT template for table `CatalogsHotelFeed`
--
INSERT INTO `CatalogsHotelFeed`(`created_at`, `id`, `updated_at`, `catalog_id`, `catalog_type`, `credentials`, `default_currency`, `default_locale`, `format`, `location`, `name`, `preferred_processing_schedule`, `status`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsHotelFeed`
--
UPDATE `CatalogsHotelFeed` SET `created_at` = ?, `id` = ?, `updated_at` = ?, `catalog_id` = ?, `catalog_type` = ?, `credentials` = ?, `default_currency` = ?, `default_locale` = ?, `format` = ?, `location` = ?, `name` = ?, `preferred_processing_schedule` = ?, `status` = ? WHERE 1;

--
-- DELETE template for table `CatalogsHotelFeed`
--
DELETE FROM `CatalogsHotelFeed` WHERE 0;

