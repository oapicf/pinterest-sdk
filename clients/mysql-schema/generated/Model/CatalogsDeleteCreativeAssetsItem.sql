--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsDeleteCreativeAssetsItem' definition.
--


--
-- SELECT template for table `CatalogsDeleteCreativeAssetsItem`
--
SELECT `creative_assets_id`, `operation` FROM `CatalogsDeleteCreativeAssetsItem` WHERE 1;

--
-- INSERT template for table `CatalogsDeleteCreativeAssetsItem`
--
INSERT INTO `CatalogsDeleteCreativeAssetsItem`(`creative_assets_id`, `operation`) VALUES (?, ?);

--
-- UPDATE template for table `CatalogsDeleteCreativeAssetsItem`
--
UPDATE `CatalogsDeleteCreativeAssetsItem` SET `creative_assets_id` = ?, `operation` = ? WHERE 1;

--
-- DELETE template for table `CatalogsDeleteCreativeAssetsItem`
--
DELETE FROM `CatalogsDeleteCreativeAssetsItem` WHERE 0;

