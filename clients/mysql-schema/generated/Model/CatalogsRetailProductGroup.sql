--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsRetailProductGroup' definition.
--


--
-- SELECT template for table `CatalogsRetailProductGroup`
--
SELECT `catalog_id`, `catalog_type`, `country`, `created_at`, `description`, `feed_id`, `filters`, `id`, `is_featured`, `locale`, `name`, `status`, `type`, `updated_at` FROM `CatalogsRetailProductGroup` WHERE 1;

--
-- INSERT template for table `CatalogsRetailProductGroup`
--
INSERT INTO `CatalogsRetailProductGroup`(`catalog_id`, `catalog_type`, `country`, `created_at`, `description`, `feed_id`, `filters`, `id`, `is_featured`, `locale`, `name`, `status`, `type`, `updated_at`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsRetailProductGroup`
--
UPDATE `CatalogsRetailProductGroup` SET `catalog_id` = ?, `catalog_type` = ?, `country` = ?, `created_at` = ?, `description` = ?, `feed_id` = ?, `filters` = ?, `id` = ?, `is_featured` = ?, `locale` = ?, `name` = ?, `status` = ?, `type` = ?, `updated_at` = ? WHERE 1;

--
-- DELETE template for table `CatalogsRetailProductGroup`
--
DELETE FROM `CatalogsRetailProductGroup` WHERE 0;

