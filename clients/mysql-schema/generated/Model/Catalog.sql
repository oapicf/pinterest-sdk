--
-- Pinterest REST API.
-- Prepared SQL queries for 'Catalog' definition.
--


--
-- SELECT template for table `Catalog`
--
SELECT `catalog_type`, `created_at`, `id`, `name`, `updated_at` FROM `Catalog` WHERE 1;

--
-- INSERT template for table `Catalog`
--
INSERT INTO `Catalog`(`catalog_type`, `created_at`, `id`, `name`, `updated_at`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `Catalog`
--
UPDATE `Catalog` SET `catalog_type` = ?, `created_at` = ?, `id` = ?, `name` = ?, `updated_at` = ? WHERE 1;

--
-- DELETE template for table `Catalog`
--
DELETE FROM `Catalog` WHERE 0;

