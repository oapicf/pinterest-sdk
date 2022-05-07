--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsDbItem' definition.
--


--
-- SELECT template for table `CatalogsDbItem`
--
SELECT `created_at`, `id`, `updated_at` FROM `CatalogsDbItem` WHERE 1;

--
-- INSERT template for table `CatalogsDbItem`
--
INSERT INTO `CatalogsDbItem`(`created_at`, `id`, `updated_at`) VALUES (?, ?, ?);

--
-- UPDATE template for table `CatalogsDbItem`
--
UPDATE `CatalogsDbItem` SET `created_at` = ?, `id` = ?, `updated_at` = ? WHERE 1;

--
-- DELETE template for table `CatalogsDbItem`
--
DELETE FROM `CatalogsDbItem` WHERE 0;

