--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsCreativeAssetsProductGroupProductCounts' definition.
--


--
-- SELECT template for table `CatalogsCreativeAssetsProductGroupProductCounts`
--
SELECT `catalog_type`, `total`, `videos` FROM `CatalogsCreativeAssetsProductGroupProductCounts` WHERE 1;

--
-- INSERT template for table `CatalogsCreativeAssetsProductGroupProductCounts`
--
INSERT INTO `CatalogsCreativeAssetsProductGroupProductCounts`(`catalog_type`, `total`, `videos`) VALUES (?, ?, ?);

--
-- UPDATE template for table `CatalogsCreativeAssetsProductGroupProductCounts`
--
UPDATE `CatalogsCreativeAssetsProductGroupProductCounts` SET `catalog_type` = ?, `total` = ?, `videos` = ? WHERE 1;

--
-- DELETE template for table `CatalogsCreativeAssetsProductGroupProductCounts`
--
DELETE FROM `CatalogsCreativeAssetsProductGroupProductCounts` WHERE 0;

