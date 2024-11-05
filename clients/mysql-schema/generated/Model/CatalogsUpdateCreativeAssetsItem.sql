--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsUpdateCreativeAssetsItem' definition.
--


--
-- SELECT template for table `CatalogsUpdateCreativeAssetsItem`
--
SELECT `creative_assets_id`, `operation`, `attributes` FROM `CatalogsUpdateCreativeAssetsItem` WHERE 1;

--
-- INSERT template for table `CatalogsUpdateCreativeAssetsItem`
--
INSERT INTO `CatalogsUpdateCreativeAssetsItem`(`creative_assets_id`, `operation`, `attributes`) VALUES (?, ?, ?);

--
-- UPDATE template for table `CatalogsUpdateCreativeAssetsItem`
--
UPDATE `CatalogsUpdateCreativeAssetsItem` SET `creative_assets_id` = ?, `operation` = ?, `attributes` = ? WHERE 1;

--
-- DELETE template for table `CatalogsUpdateCreativeAssetsItem`
--
DELETE FROM `CatalogsUpdateCreativeAssetsItem` WHERE 0;

