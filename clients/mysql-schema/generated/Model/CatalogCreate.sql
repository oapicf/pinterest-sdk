--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogCreate' definition.
--


--
-- SELECT template for table `CatalogCreate`
--
SELECT `catalog_type`, `name` FROM `CatalogCreate` WHERE 1;

--
-- INSERT template for table `CatalogCreate`
--
INSERT INTO `CatalogCreate`(`catalog_type`, `name`) VALUES (?, ?);

--
-- UPDATE template for table `CatalogCreate`
--
UPDATE `CatalogCreate` SET `catalog_type` = ?, `name` = ? WHERE 1;

--
-- DELETE template for table `CatalogCreate`
--
DELETE FROM `CatalogCreate` WHERE 0;

