--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsCreativeAssetsItemsBatch' definition.
--


--
-- SELECT template for table `CatalogsCreativeAssetsItemsBatch`
--
SELECT `batch_id`, `created_time`, `completed_time`, `status`, `catalog_type`, `items` FROM `CatalogsCreativeAssetsItemsBatch` WHERE 1;

--
-- INSERT template for table `CatalogsCreativeAssetsItemsBatch`
--
INSERT INTO `CatalogsCreativeAssetsItemsBatch`(`batch_id`, `created_time`, `completed_time`, `status`, `catalog_type`, `items`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsCreativeAssetsItemsBatch`
--
UPDATE `CatalogsCreativeAssetsItemsBatch` SET `batch_id` = ?, `created_time` = ?, `completed_time` = ?, `status` = ?, `catalog_type` = ?, `items` = ? WHERE 1;

--
-- DELETE template for table `CatalogsCreativeAssetsItemsBatch`
--
DELETE FROM `CatalogsCreativeAssetsItemsBatch` WHERE 0;

