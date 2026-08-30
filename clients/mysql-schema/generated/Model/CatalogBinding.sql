--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogBinding' definition.
--


--
-- SELECT template for table `CatalogBinding`
--
SELECT `catalog_type`, `id`, `name` FROM `CatalogBinding` WHERE 1;

--
-- INSERT template for table `CatalogBinding`
--
INSERT INTO `CatalogBinding`(`catalog_type`, `id`, `name`) VALUES (?, ?, ?);

--
-- UPDATE template for table `CatalogBinding`
--
UPDATE `CatalogBinding` SET `catalog_type` = ?, `id` = ?, `name` = ? WHERE 1;

--
-- DELETE template for table `CatalogBinding`
--
DELETE FROM `CatalogBinding` WHERE 0;

