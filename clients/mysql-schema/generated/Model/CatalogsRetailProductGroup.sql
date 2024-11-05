--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsRetailProductGroup' definition.
--


--
-- SELECT template for table `CatalogsRetailProductGroup`
--
SELECT `catalog_type`, `id`, `name`, `description`, `filters`, `is_featured`, `type`, `status`, `created_at`, `updated_at`, `catalog_id`, `feed_id`, `country`, `locale` FROM `CatalogsRetailProductGroup` WHERE 1;

--
-- INSERT template for table `CatalogsRetailProductGroup`
--
INSERT INTO `CatalogsRetailProductGroup`(`catalog_type`, `id`, `name`, `description`, `filters`, `is_featured`, `type`, `status`, `created_at`, `updated_at`, `catalog_id`, `feed_id`, `country`, `locale`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsRetailProductGroup`
--
UPDATE `CatalogsRetailProductGroup` SET `catalog_type` = ?, `id` = ?, `name` = ?, `description` = ?, `filters` = ?, `is_featured` = ?, `type` = ?, `status` = ?, `created_at` = ?, `updated_at` = ?, `catalog_id` = ?, `feed_id` = ?, `country` = ?, `locale` = ? WHERE 1;

--
-- DELETE template for table `CatalogsRetailProductGroup`
--
DELETE FROM `CatalogsRetailProductGroup` WHERE 0;

