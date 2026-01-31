--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsUpsertCreativeAssetsItem' definition.
--


--
-- SELECT template for table `CatalogsUpsertCreativeAssetsItem`
--
SELECT `attributes`, `creative_assets_id`, `operation` FROM `CatalogsUpsertCreativeAssetsItem` WHERE 1;

--
-- INSERT template for table `CatalogsUpsertCreativeAssetsItem`
--
INSERT INTO `CatalogsUpsertCreativeAssetsItem`(`attributes`, `creative_assets_id`, `operation`) VALUES (?, ?, ?);

--
-- UPDATE template for table `CatalogsUpsertCreativeAssetsItem`
--
UPDATE `CatalogsUpsertCreativeAssetsItem` SET `attributes` = ?, `creative_assets_id` = ?, `operation` = ? WHERE 1;

--
-- DELETE template for table `CatalogsUpsertCreativeAssetsItem`
--
DELETE FROM `CatalogsUpsertCreativeAssetsItem` WHERE 0;

