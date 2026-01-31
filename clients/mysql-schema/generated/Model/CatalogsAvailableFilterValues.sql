--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsAvailableFilterValues' definition.
--


--
-- SELECT template for table `CatalogsAvailableFilterValues`
--
SELECT `catalog_type`, `filter_values` FROM `CatalogsAvailableFilterValues` WHERE 1;

--
-- INSERT template for table `CatalogsAvailableFilterValues`
--
INSERT INTO `CatalogsAvailableFilterValues`(`catalog_type`, `filter_values`) VALUES (?, ?);

--
-- UPDATE template for table `CatalogsAvailableFilterValues`
--
UPDATE `CatalogsAvailableFilterValues` SET `catalog_type` = ?, `filter_values` = ? WHERE 1;

--
-- DELETE template for table `CatalogsAvailableFilterValues`
--
DELETE FROM `CatalogsAvailableFilterValues` WHERE 0;

