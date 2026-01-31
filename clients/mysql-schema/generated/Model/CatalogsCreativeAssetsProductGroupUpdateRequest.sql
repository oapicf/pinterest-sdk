--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsCreativeAssetsProductGroupUpdateRequest' definition.
--


--
-- SELECT template for table `CatalogsCreativeAssetsProductGroupUpdateRequest`
--
SELECT `catalog_type`, `description`, `filters`, `name` FROM `CatalogsCreativeAssetsProductGroupUpdateRequest` WHERE 1;

--
-- INSERT template for table `CatalogsCreativeAssetsProductGroupUpdateRequest`
--
INSERT INTO `CatalogsCreativeAssetsProductGroupUpdateRequest`(`catalog_type`, `description`, `filters`, `name`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsCreativeAssetsProductGroupUpdateRequest`
--
UPDATE `CatalogsCreativeAssetsProductGroupUpdateRequest` SET `catalog_type` = ?, `description` = ?, `filters` = ?, `name` = ? WHERE 1;

--
-- DELETE template for table `CatalogsCreativeAssetsProductGroupUpdateRequest`
--
DELETE FROM `CatalogsCreativeAssetsProductGroupUpdateRequest` WHERE 0;

