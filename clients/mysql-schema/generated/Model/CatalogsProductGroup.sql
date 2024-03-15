--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsProductGroup' definition.
--


--
-- SELECT template for table `CatalogsProductGroup`
--
SELECT `id`, `name`, `description`, `filters`, `is_featured`, `type`, `status`, `created_at`, `updated_at`, `feed_id`, `catalog_type` FROM `CatalogsProductGroup` WHERE 1;

--
-- INSERT template for table `CatalogsProductGroup`
--
INSERT INTO `CatalogsProductGroup`(`id`, `name`, `description`, `filters`, `is_featured`, `type`, `status`, `created_at`, `updated_at`, `feed_id`, `catalog_type`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsProductGroup`
--
UPDATE `CatalogsProductGroup` SET `id` = ?, `name` = ?, `description` = ?, `filters` = ?, `is_featured` = ?, `type` = ?, `status` = ?, `created_at` = ?, `updated_at` = ?, `feed_id` = ?, `catalog_type` = ? WHERE 1;

--
-- DELETE template for table `CatalogsProductGroup`
--
DELETE FROM `CatalogsProductGroup` WHERE 0;

