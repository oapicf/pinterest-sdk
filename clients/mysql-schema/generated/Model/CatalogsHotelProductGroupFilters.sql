--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsHotelProductGroupFilters' definition.
--


--
-- SELECT template for table `CatalogsHotelProductGroupFilters`
--
SELECT `any_of`, `all_of` FROM `CatalogsHotelProductGroupFilters` WHERE 1;

--
-- INSERT template for table `CatalogsHotelProductGroupFilters`
--
INSERT INTO `CatalogsHotelProductGroupFilters`(`any_of`, `all_of`) VALUES (?, ?);

--
-- UPDATE template for table `CatalogsHotelProductGroupFilters`
--
UPDATE `CatalogsHotelProductGroupFilters` SET `any_of` = ?, `all_of` = ? WHERE 1;

--
-- DELETE template for table `CatalogsHotelProductGroupFilters`
--
DELETE FROM `CatalogsHotelProductGroupFilters` WHERE 0;

