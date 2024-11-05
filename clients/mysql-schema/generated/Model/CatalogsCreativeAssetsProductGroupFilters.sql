--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsCreativeAssetsProductGroupFilters' definition.
--


--
-- SELECT template for table `CatalogsCreativeAssetsProductGroupFilters`
--
SELECT `any_of`, `all_of` FROM `CatalogsCreativeAssetsProductGroupFilters` WHERE 1;

--
-- INSERT template for table `CatalogsCreativeAssetsProductGroupFilters`
--
INSERT INTO `CatalogsCreativeAssetsProductGroupFilters`(`any_of`, `all_of`) VALUES (?, ?);

--
-- UPDATE template for table `CatalogsCreativeAssetsProductGroupFilters`
--
UPDATE `CatalogsCreativeAssetsProductGroupFilters` SET `any_of` = ?, `all_of` = ? WHERE 1;

--
-- DELETE template for table `CatalogsCreativeAssetsProductGroupFilters`
--
DELETE FROM `CatalogsCreativeAssetsProductGroupFilters` WHERE 0;

