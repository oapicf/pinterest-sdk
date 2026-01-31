--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsCreativeAssetsItemsBatch' definition.
--


--
-- SELECT template for table `CatalogsCreativeAssetsItemsBatch`
--
SELECT `batch_id`, `catalog_type`, `completed_time`, `created_time`, `items`, `status` FROM `CatalogsCreativeAssetsItemsBatch` WHERE 1;

--
-- INSERT template for table `CatalogsCreativeAssetsItemsBatch`
--
INSERT INTO `CatalogsCreativeAssetsItemsBatch`(`batch_id`, `catalog_type`, `completed_time`, `created_time`, `items`, `status`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsCreativeAssetsItemsBatch`
--
UPDATE `CatalogsCreativeAssetsItemsBatch` SET `batch_id` = ?, `catalog_type` = ?, `completed_time` = ?, `created_time` = ?, `items` = ?, `status` = ? WHERE 1;

--
-- DELETE template for table `CatalogsCreativeAssetsItemsBatch`
--
DELETE FROM `CatalogsCreativeAssetsItemsBatch` WHERE 0;

