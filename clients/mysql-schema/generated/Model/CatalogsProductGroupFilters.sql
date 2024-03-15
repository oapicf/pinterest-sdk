--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsProductGroupFilters' definition.
--


--
-- SELECT template for table `CatalogsProductGroupFilters`
--
SELECT `any_of`, `all_of` FROM `CatalogsProductGroupFilters` WHERE 1;

--
-- INSERT template for table `CatalogsProductGroupFilters`
--
INSERT INTO `CatalogsProductGroupFilters`(`any_of`, `all_of`) VALUES (?, ?);

--
-- UPDATE template for table `CatalogsProductGroupFilters`
--
UPDATE `CatalogsProductGroupFilters` SET `any_of` = ?, `all_of` = ? WHERE 1;

--
-- DELETE template for table `CatalogsProductGroupFilters`
--
DELETE FROM `CatalogsProductGroupFilters` WHERE 0;

