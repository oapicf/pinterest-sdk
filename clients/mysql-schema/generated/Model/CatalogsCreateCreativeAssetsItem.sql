--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsCreateCreativeAssetsItem' definition.
--


--
-- SELECT template for table `CatalogsCreateCreativeAssetsItem`
--
SELECT `attributes`, `creative_assets_id`, `operation` FROM `CatalogsCreateCreativeAssetsItem` WHERE 1;

--
-- INSERT template for table `CatalogsCreateCreativeAssetsItem`
--
INSERT INTO `CatalogsCreateCreativeAssetsItem`(`attributes`, `creative_assets_id`, `operation`) VALUES (?, ?, ?);

--
-- UPDATE template for table `CatalogsCreateCreativeAssetsItem`
--
UPDATE `CatalogsCreateCreativeAssetsItem` SET `attributes` = ?, `creative_assets_id` = ?, `operation` = ? WHERE 1;

--
-- DELETE template for table `CatalogsCreateCreativeAssetsItem`
--
DELETE FROM `CatalogsCreateCreativeAssetsItem` WHERE 0;

