--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsCreativeAssetsProduct' definition.
--


--
-- SELECT template for table `CatalogsCreativeAssetsProduct`
--
SELECT `catalog_type`, `metadata`, `pin` FROM `CatalogsCreativeAssetsProduct` WHERE 1;

--
-- INSERT template for table `CatalogsCreativeAssetsProduct`
--
INSERT INTO `CatalogsCreativeAssetsProduct`(`catalog_type`, `metadata`, `pin`) VALUES (?, ?, ?);

--
-- UPDATE template for table `CatalogsCreativeAssetsProduct`
--
UPDATE `CatalogsCreativeAssetsProduct` SET `catalog_type` = ?, `metadata` = ?, `pin` = ? WHERE 1;

--
-- DELETE template for table `CatalogsCreativeAssetsProduct`
--
DELETE FROM `CatalogsCreativeAssetsProduct` WHERE 0;

