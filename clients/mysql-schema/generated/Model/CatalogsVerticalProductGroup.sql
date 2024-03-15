--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsVerticalProductGroup' definition.
--


--
-- SELECT template for table `CatalogsVerticalProductGroup`
--
SELECT `catalog_type`, `id`, `name`, `description`, `filters`, `created_at`, `updated_at`, `catalog_id`, `is_featured`, `type`, `status`, `feed_id` FROM `CatalogsVerticalProductGroup` WHERE 1;

--
-- INSERT template for table `CatalogsVerticalProductGroup`
--
INSERT INTO `CatalogsVerticalProductGroup`(`catalog_type`, `id`, `name`, `description`, `filters`, `created_at`, `updated_at`, `catalog_id`, `is_featured`, `type`, `status`, `feed_id`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsVerticalProductGroup`
--
UPDATE `CatalogsVerticalProductGroup` SET `catalog_type` = ?, `id` = ?, `name` = ?, `description` = ?, `filters` = ?, `created_at` = ?, `updated_at` = ?, `catalog_id` = ?, `is_featured` = ?, `type` = ?, `status` = ?, `feed_id` = ? WHERE 1;

--
-- DELETE template for table `CatalogsVerticalProductGroup`
--
DELETE FROM `CatalogsVerticalProductGroup` WHERE 0;

