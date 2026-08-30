--
-- Pinterest REST API.
-- Prepared SQL queries for 'BulkUpsertRequestUpdate' definition.
--


--
-- SELECT template for table `BulkUpsertRequestUpdate`
--
SELECT `ad_groups`, `ads`, `campaigns`, `catalog_product_groups`, `keywords`, `labels`, `product_groups`, `schedules` FROM `BulkUpsertRequestUpdate` WHERE 1;

--
-- INSERT template for table `BulkUpsertRequestUpdate`
--
INSERT INTO `BulkUpsertRequestUpdate`(`ad_groups`, `ads`, `campaigns`, `catalog_product_groups`, `keywords`, `labels`, `product_groups`, `schedules`) VALUES (?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `BulkUpsertRequestUpdate`
--
UPDATE `BulkUpsertRequestUpdate` SET `ad_groups` = ?, `ads` = ?, `campaigns` = ?, `catalog_product_groups` = ?, `keywords` = ?, `labels` = ?, `product_groups` = ?, `schedules` = ? WHERE 1;

--
-- DELETE template for table `BulkUpsertRequestUpdate`
--
DELETE FROM `BulkUpsertRequestUpdate` WHERE 0;

