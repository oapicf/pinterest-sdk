--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsCreativeAssetsAvailableFilterValues' definition.
--


--
-- SELECT template for table `CatalogsCreativeAssetsAvailableFilterValues`
--
SELECT `catalog_type`, `filter_values` FROM `CatalogsCreativeAssetsAvailableFilterValues` WHERE 1;

--
-- INSERT template for table `CatalogsCreativeAssetsAvailableFilterValues`
--
INSERT INTO `CatalogsCreativeAssetsAvailableFilterValues`(`catalog_type`, `filter_values`) VALUES (?, ?);

--
-- UPDATE template for table `CatalogsCreativeAssetsAvailableFilterValues`
--
UPDATE `CatalogsCreativeAssetsAvailableFilterValues` SET `catalog_type` = ?, `filter_values` = ? WHERE 1;

--
-- DELETE template for table `CatalogsCreativeAssetsAvailableFilterValues`
--
DELETE FROM `CatalogsCreativeAssetsAvailableFilterValues` WHERE 0;

