--
-- Pinterest REST API.
-- Prepared SQL queries for 'Catalog' definition.
--


--
-- SELECT template for table `Catalog`
--
SELECT `created_at`, `id`, `updated_at`, `name`, `catalog_type` FROM `Catalog` WHERE 1;

--
-- INSERT template for table `Catalog`
--
INSERT INTO `Catalog`(`created_at`, `id`, `updated_at`, `name`, `catalog_type`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `Catalog`
--
UPDATE `Catalog` SET `created_at` = ?, `id` = ?, `updated_at` = ?, `name` = ?, `catalog_type` = ? WHERE 1;

--
-- DELETE template for table `Catalog`
--
DELETE FROM `Catalog` WHERE 0;

