--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsUpsertCreativeAssetsItem' definition.
--


--
-- SELECT template for table `CatalogsUpsertCreativeAssetsItem`
--
SELECT `creative_assets_id`, `operation`, `attributes` FROM `CatalogsUpsertCreativeAssetsItem` WHERE 1;

--
-- INSERT template for table `CatalogsUpsertCreativeAssetsItem`
--
INSERT INTO `CatalogsUpsertCreativeAssetsItem`(`creative_assets_id`, `operation`, `attributes`) VALUES (?, ?, ?);

--
-- UPDATE template for table `CatalogsUpsertCreativeAssetsItem`
--
UPDATE `CatalogsUpsertCreativeAssetsItem` SET `creative_assets_id` = ?, `operation` = ?, `attributes` = ? WHERE 1;

--
-- DELETE template for table `CatalogsUpsertCreativeAssetsItem`
--
DELETE FROM `CatalogsUpsertCreativeAssetsItem` WHERE 0;

