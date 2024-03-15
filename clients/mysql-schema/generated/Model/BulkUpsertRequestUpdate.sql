--
-- Pinterest REST API.
-- Prepared SQL queries for 'BulkUpsertRequestUpdate' definition.
--


--
-- SELECT template for table `BulkUpsertRequestUpdate`
--
SELECT `campaigns`, `ad_groups`, `ads`, `product_groups`, `keywords` FROM `BulkUpsertRequestUpdate` WHERE 1;

--
-- INSERT template for table `BulkUpsertRequestUpdate`
--
INSERT INTO `BulkUpsertRequestUpdate`(`campaigns`, `ad_groups`, `ads`, `product_groups`, `keywords`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `BulkUpsertRequestUpdate`
--
UPDATE `BulkUpsertRequestUpdate` SET `campaigns` = ?, `ad_groups` = ?, `ads` = ?, `product_groups` = ?, `keywords` = ? WHERE 1;

--
-- DELETE template for table `BulkUpsertRequestUpdate`
--
DELETE FROM `BulkUpsertRequestUpdate` WHERE 0;

