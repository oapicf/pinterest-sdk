--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsProductGroupFiltersRequest' definition.
--


--
-- SELECT template for table `CatalogsProductGroupFiltersRequest`
--
SELECT `any_of`, `all_of` FROM `CatalogsProductGroupFiltersRequest` WHERE 1;

--
-- INSERT template for table `CatalogsProductGroupFiltersRequest`
--
INSERT INTO `CatalogsProductGroupFiltersRequest`(`any_of`, `all_of`) VALUES (?, ?);

--
-- UPDATE template for table `CatalogsProductGroupFiltersRequest`
--
UPDATE `CatalogsProductGroupFiltersRequest` SET `any_of` = ?, `all_of` = ? WHERE 1;

--
-- DELETE template for table `CatalogsProductGroupFiltersRequest`
--
DELETE FROM `CatalogsProductGroupFiltersRequest` WHERE 0;

