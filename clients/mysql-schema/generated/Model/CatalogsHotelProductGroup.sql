--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsHotelProductGroup' definition.
--


--
-- SELECT template for table `CatalogsHotelProductGroup`
--
SELECT `catalog_type`, `id`, `name`, `description`, `filters`, `created_at`, `updated_at`, `catalog_id` FROM `CatalogsHotelProductGroup` WHERE 1;

--
-- INSERT template for table `CatalogsHotelProductGroup`
--
INSERT INTO `CatalogsHotelProductGroup`(`catalog_type`, `id`, `name`, `description`, `filters`, `created_at`, `updated_at`, `catalog_id`) VALUES (?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsHotelProductGroup`
--
UPDATE `CatalogsHotelProductGroup` SET `catalog_type` = ?, `id` = ?, `name` = ?, `description` = ?, `filters` = ?, `created_at` = ?, `updated_at` = ?, `catalog_id` = ? WHERE 1;

--
-- DELETE template for table `CatalogsHotelProductGroup`
--
DELETE FROM `CatalogsHotelProductGroup` WHERE 0;

