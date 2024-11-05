--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsCreativeAssetsProductGroupCreateRequest' definition.
--


--
-- SELECT template for table `CatalogsCreativeAssetsProductGroupCreateRequest`
--
SELECT `catalog_type`, `name`, `description`, `filters`, `catalog_id` FROM `CatalogsCreativeAssetsProductGroupCreateRequest` WHERE 1;

--
-- INSERT template for table `CatalogsCreativeAssetsProductGroupCreateRequest`
--
INSERT INTO `CatalogsCreativeAssetsProductGroupCreateRequest`(`catalog_type`, `name`, `description`, `filters`, `catalog_id`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsCreativeAssetsProductGroupCreateRequest`
--
UPDATE `CatalogsCreativeAssetsProductGroupCreateRequest` SET `catalog_type` = ?, `name` = ?, `description` = ?, `filters` = ?, `catalog_id` = ? WHERE 1;

--
-- DELETE template for table `CatalogsCreativeAssetsProductGroupCreateRequest`
--
DELETE FROM `CatalogsCreativeAssetsProductGroupCreateRequest` WHERE 0;

