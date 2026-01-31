--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsHotelProductGroup' definition.
--


--
-- SELECT template for table `CatalogsHotelProductGroup`
--
SELECT `catalog_id`, `catalog_type`, `created_at`, `description`, `filters`, `id`, `name`, `type`, `updated_at` FROM `CatalogsHotelProductGroup` WHERE 1;

--
-- INSERT template for table `CatalogsHotelProductGroup`
--
INSERT INTO `CatalogsHotelProductGroup`(`catalog_id`, `catalog_type`, `created_at`, `description`, `filters`, `id`, `name`, `type`, `updated_at`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsHotelProductGroup`
--
UPDATE `CatalogsHotelProductGroup` SET `catalog_id` = ?, `catalog_type` = ?, `created_at` = ?, `description` = ?, `filters` = ?, `id` = ?, `name` = ?, `type` = ?, `updated_at` = ? WHERE 1;

--
-- DELETE template for table `CatalogsHotelProductGroup`
--
DELETE FROM `CatalogsHotelProductGroup` WHERE 0;

