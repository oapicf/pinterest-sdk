--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsVerticalProductGroup' definition.
--


--
-- SELECT template for table `CatalogsVerticalProductGroup`
--
SELECT `catalog_type`, `id`, `name`, `description`, `filters`, `is_featured`, `type`, `status`, `created_at`, `updated_at`, `catalog_id`, `feed_id`, `country`, `locale` FROM `CatalogsVerticalProductGroup` WHERE 1;

--
-- INSERT template for table `CatalogsVerticalProductGroup`
--
INSERT INTO `CatalogsVerticalProductGroup`(`catalog_type`, `id`, `name`, `description`, `filters`, `is_featured`, `type`, `status`, `created_at`, `updated_at`, `catalog_id`, `feed_id`, `country`, `locale`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsVerticalProductGroup`
--
UPDATE `CatalogsVerticalProductGroup` SET `catalog_type` = ?, `id` = ?, `name` = ?, `description` = ?, `filters` = ?, `is_featured` = ?, `type` = ?, `status` = ?, `created_at` = ?, `updated_at` = ?, `catalog_id` = ?, `feed_id` = ?, `country` = ?, `locale` = ? WHERE 1;

--
-- DELETE template for table `CatalogsVerticalProductGroup`
--
DELETE FROM `CatalogsVerticalProductGroup` WHERE 0;

