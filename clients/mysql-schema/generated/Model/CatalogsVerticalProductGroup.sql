--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsVerticalProductGroup' definition.
--


--
-- SELECT template for table `CatalogsVerticalProductGroup`
--
SELECT `catalog_id`, `catalog_type`, `country`, `created_at`, `description`, `feed_id`, `filters`, `id`, `is_featured`, `locale`, `name`, `status`, `type`, `updated_at` FROM `CatalogsVerticalProductGroup` WHERE 1;

--
-- INSERT template for table `CatalogsVerticalProductGroup`
--
INSERT INTO `CatalogsVerticalProductGroup`(`catalog_id`, `catalog_type`, `country`, `created_at`, `description`, `feed_id`, `filters`, `id`, `is_featured`, `locale`, `name`, `status`, `type`, `updated_at`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsVerticalProductGroup`
--
UPDATE `CatalogsVerticalProductGroup` SET `catalog_id` = ?, `catalog_type` = ?, `country` = ?, `created_at` = ?, `description` = ?, `feed_id` = ?, `filters` = ?, `id` = ?, `is_featured` = ?, `locale` = ?, `name` = ?, `status` = ?, `type` = ?, `updated_at` = ? WHERE 1;

--
-- DELETE template for table `CatalogsVerticalProductGroup`
--
DELETE FROM `CatalogsVerticalProductGroup` WHERE 0;

