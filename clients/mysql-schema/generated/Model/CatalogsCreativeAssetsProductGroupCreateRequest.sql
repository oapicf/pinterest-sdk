--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsCreativeAssetsProductGroupCreateRequest' definition.
--


--
-- SELECT template for table `CatalogsCreativeAssetsProductGroupCreateRequest`
--
SELECT `catalog_id`, `catalog_type`, `description`, `filters`, `name` FROM `CatalogsCreativeAssetsProductGroupCreateRequest` WHERE 1;

--
-- INSERT template for table `CatalogsCreativeAssetsProductGroupCreateRequest`
--
INSERT INTO `CatalogsCreativeAssetsProductGroupCreateRequest`(`catalog_id`, `catalog_type`, `description`, `filters`, `name`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsCreativeAssetsProductGroupCreateRequest`
--
UPDATE `CatalogsCreativeAssetsProductGroupCreateRequest` SET `catalog_id` = ?, `catalog_type` = ?, `description` = ?, `filters` = ?, `name` = ? WHERE 1;

--
-- DELETE template for table `CatalogsCreativeAssetsProductGroupCreateRequest`
--
DELETE FROM `CatalogsCreativeAssetsProductGroupCreateRequest` WHERE 0;

