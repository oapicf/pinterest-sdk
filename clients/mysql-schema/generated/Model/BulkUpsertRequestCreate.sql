--
-- Pinterest REST API.
-- Prepared SQL queries for 'BulkUpsertRequestCreate' definition.
--


--
-- SELECT template for table `BulkUpsertRequestCreate`
--
SELECT `campaigns`, `ad_groups`, `ads`, `product_groups`, `keywords` FROM `BulkUpsertRequestCreate` WHERE 1;

--
-- INSERT template for table `BulkUpsertRequestCreate`
--
INSERT INTO `BulkUpsertRequestCreate`(`campaigns`, `ad_groups`, `ads`, `product_groups`, `keywords`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `BulkUpsertRequestCreate`
--
UPDATE `BulkUpsertRequestCreate` SET `campaigns` = ?, `ad_groups` = ?, `ads` = ?, `product_groups` = ?, `keywords` = ? WHERE 1;

--
-- DELETE template for table `BulkUpsertRequestCreate`
--
DELETE FROM `BulkUpsertRequestCreate` WHERE 0;

