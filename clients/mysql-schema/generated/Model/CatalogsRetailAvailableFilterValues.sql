--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsRetailAvailableFilterValues' definition.
--


--
-- SELECT template for table `CatalogsRetailAvailableFilterValues`
--
SELECT `catalog_type`, `filter_values` FROM `CatalogsRetailAvailableFilterValues` WHERE 1;

--
-- INSERT template for table `CatalogsRetailAvailableFilterValues`
--
INSERT INTO `CatalogsRetailAvailableFilterValues`(`catalog_type`, `filter_values`) VALUES (?, ?);

--
-- UPDATE template for table `CatalogsRetailAvailableFilterValues`
--
UPDATE `CatalogsRetailAvailableFilterValues` SET `catalog_type` = ?, `filter_values` = ? WHERE 1;

--
-- DELETE template for table `CatalogsRetailAvailableFilterValues`
--
DELETE FROM `CatalogsRetailAvailableFilterValues` WHERE 0;

