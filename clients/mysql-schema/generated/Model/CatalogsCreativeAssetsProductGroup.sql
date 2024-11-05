--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsCreativeAssetsProductGroup' definition.
--


--
-- SELECT template for table `CatalogsCreativeAssetsProductGroup`
--
SELECT `catalog_type`, `id`, `name`, `description`, `filters`, `created_at`, `updated_at`, `catalog_id` FROM `CatalogsCreativeAssetsProductGroup` WHERE 1;

--
-- INSERT template for table `CatalogsCreativeAssetsProductGroup`
--
INSERT INTO `CatalogsCreativeAssetsProductGroup`(`catalog_type`, `id`, `name`, `description`, `filters`, `created_at`, `updated_at`, `catalog_id`) VALUES (?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsCreativeAssetsProductGroup`
--
UPDATE `CatalogsCreativeAssetsProductGroup` SET `catalog_type` = ?, `id` = ?, `name` = ?, `description` = ?, `filters` = ?, `created_at` = ?, `updated_at` = ?, `catalog_id` = ? WHERE 1;

--
-- DELETE template for table `CatalogsCreativeAssetsProductGroup`
--
DELETE FROM `CatalogsCreativeAssetsProductGroup` WHERE 0;

