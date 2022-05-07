--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsProductGroup' definition.
--


--
-- SELECT template for table `CatalogsProductGroup`
--
SELECT `id`, `name`, `description`, `filters`, `type`, `status`, `feed_id`, `created_at`, `updated_at` FROM `CatalogsProductGroup` WHERE 1;

--
-- INSERT template for table `CatalogsProductGroup`
--
INSERT INTO `CatalogsProductGroup`(`id`, `name`, `description`, `filters`, `type`, `status`, `feed_id`, `created_at`, `updated_at`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsProductGroup`
--
UPDATE `CatalogsProductGroup` SET `id` = ?, `name` = ?, `description` = ?, `filters` = ?, `type` = ?, `status` = ?, `feed_id` = ?, `created_at` = ?, `updated_at` = ? WHERE 1;

--
-- DELETE template for table `CatalogsProductGroup`
--
DELETE FROM `CatalogsProductGroup` WHERE 0;

