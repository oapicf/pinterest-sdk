--
-- Pinterest REST API.
-- Prepared SQL queries for 'Catalog' definition.
--


--
-- SELECT template for table `Catalog`
--
SELECT `created_at`, `id`, `updated_at`, `catalog_type`, `name` FROM `Catalog` WHERE 1;

--
-- INSERT template for table `Catalog`
--
INSERT INTO `Catalog`(`created_at`, `id`, `updated_at`, `catalog_type`, `name`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `Catalog`
--
UPDATE `Catalog` SET `created_at` = ?, `id` = ?, `updated_at` = ?, `catalog_type` = ?, `name` = ? WHERE 1;

--
-- DELETE template for table `Catalog`
--
DELETE FROM `Catalog` WHERE 0;

