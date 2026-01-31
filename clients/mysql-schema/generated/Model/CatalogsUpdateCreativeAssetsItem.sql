--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsUpdateCreativeAssetsItem' definition.
--


--
-- SELECT template for table `CatalogsUpdateCreativeAssetsItem`
--
SELECT `attributes`, `creative_assets_id`, `operation` FROM `CatalogsUpdateCreativeAssetsItem` WHERE 1;

--
-- INSERT template for table `CatalogsUpdateCreativeAssetsItem`
--
INSERT INTO `CatalogsUpdateCreativeAssetsItem`(`attributes`, `creative_assets_id`, `operation`) VALUES (?, ?, ?);

--
-- UPDATE template for table `CatalogsUpdateCreativeAssetsItem`
--
UPDATE `CatalogsUpdateCreativeAssetsItem` SET `attributes` = ?, `creative_assets_id` = ?, `operation` = ? WHERE 1;

--
-- DELETE template for table `CatalogsUpdateCreativeAssetsItem`
--
DELETE FROM `CatalogsUpdateCreativeAssetsItem` WHERE 0;

