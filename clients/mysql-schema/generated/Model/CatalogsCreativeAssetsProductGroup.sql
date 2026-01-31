--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsCreativeAssetsProductGroup' definition.
--


--
-- SELECT template for table `CatalogsCreativeAssetsProductGroup`
--
SELECT `catalog_id`, `catalog_type`, `created_at`, `description`, `filters`, `id`, `name`, `updated_at` FROM `CatalogsCreativeAssetsProductGroup` WHERE 1;

--
-- INSERT template for table `CatalogsCreativeAssetsProductGroup`
--
INSERT INTO `CatalogsCreativeAssetsProductGroup`(`catalog_id`, `catalog_type`, `created_at`, `description`, `filters`, `id`, `name`, `updated_at`) VALUES (?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsCreativeAssetsProductGroup`
--
UPDATE `CatalogsCreativeAssetsProductGroup` SET `catalog_id` = ?, `catalog_type` = ?, `created_at` = ?, `description` = ?, `filters` = ?, `id` = ?, `name` = ?, `updated_at` = ? WHERE 1;

--
-- DELETE template for table `CatalogsCreativeAssetsProductGroup`
--
DELETE FROM `CatalogsCreativeAssetsProductGroup` WHERE 0;

