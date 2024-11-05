--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsCreateCreativeAssetsItem' definition.
--


--
-- SELECT template for table `CatalogsCreateCreativeAssetsItem`
--
SELECT `creative_assets_id`, `operation`, `attributes` FROM `CatalogsCreateCreativeAssetsItem` WHERE 1;

--
-- INSERT template for table `CatalogsCreateCreativeAssetsItem`
--
INSERT INTO `CatalogsCreateCreativeAssetsItem`(`creative_assets_id`, `operation`, `attributes`) VALUES (?, ?, ?);

--
-- UPDATE template for table `CatalogsCreateCreativeAssetsItem`
--
UPDATE `CatalogsCreateCreativeAssetsItem` SET `creative_assets_id` = ?, `operation` = ?, `attributes` = ? WHERE 1;

--
-- DELETE template for table `CatalogsCreateCreativeAssetsItem`
--
DELETE FROM `CatalogsCreateCreativeAssetsItem` WHERE 0;

