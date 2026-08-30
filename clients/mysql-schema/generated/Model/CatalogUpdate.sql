--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogUpdate' definition.
--


--
-- SELECT template for table `CatalogUpdate`
--
SELECT `catalog_type`, `name` FROM `CatalogUpdate` WHERE 1;

--
-- INSERT template for table `CatalogUpdate`
--
INSERT INTO `CatalogUpdate`(`catalog_type`, `name`) VALUES (?, ?);

--
-- UPDATE template for table `CatalogUpdate`
--
UPDATE `CatalogUpdate` SET `catalog_type` = ?, `name` = ? WHERE 1;

--
-- DELETE template for table `CatalogUpdate`
--
DELETE FROM `CatalogUpdate` WHERE 0;

