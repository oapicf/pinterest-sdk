--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsCreativeAssetsProductMetadata' definition.
--


--
-- SELECT template for table `CatalogsCreativeAssetsProductMetadata`
--
SELECT `creative_assets_id`, `visibility` FROM `CatalogsCreativeAssetsProductMetadata` WHERE 1;

--
-- INSERT template for table `CatalogsCreativeAssetsProductMetadata`
--
INSERT INTO `CatalogsCreativeAssetsProductMetadata`(`creative_assets_id`, `visibility`) VALUES (?, ?);

--
-- UPDATE template for table `CatalogsCreativeAssetsProductMetadata`
--
UPDATE `CatalogsCreativeAssetsProductMetadata` SET `creative_assets_id` = ?, `visibility` = ? WHERE 1;

--
-- DELETE template for table `CatalogsCreativeAssetsProductMetadata`
--
DELETE FROM `CatalogsCreativeAssetsProductMetadata` WHERE 0;

