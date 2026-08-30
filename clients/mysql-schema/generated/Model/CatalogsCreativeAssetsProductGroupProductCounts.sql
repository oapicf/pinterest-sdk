--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsCreativeAssetsProductGroupProductCounts' definition.
--


--
-- SELECT template for table `CatalogsCreativeAssetsProductGroupProductCounts`
--
SELECT `app_links`, `catalog_type`, `images`, `total`, `videos` FROM `CatalogsCreativeAssetsProductGroupProductCounts` WHERE 1;

--
-- INSERT template for table `CatalogsCreativeAssetsProductGroupProductCounts`
--
INSERT INTO `CatalogsCreativeAssetsProductGroupProductCounts`(`app_links`, `catalog_type`, `images`, `total`, `videos`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsCreativeAssetsProductGroupProductCounts`
--
UPDATE `CatalogsCreativeAssetsProductGroupProductCounts` SET `app_links` = ?, `catalog_type` = ?, `images` = ?, `total` = ?, `videos` = ? WHERE 1;

--
-- DELETE template for table `CatalogsCreativeAssetsProductGroupProductCounts`
--
DELETE FROM `CatalogsCreativeAssetsProductGroupProductCounts` WHERE 0;

