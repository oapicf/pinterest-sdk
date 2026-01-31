--
-- Pinterest REST API.
-- Prepared SQL queries for 'BulkUpsertRequestCreate' definition.
--


--
-- SELECT template for table `BulkUpsertRequestCreate`
--
SELECT `ad_groups`, `ads`, `campaigns`, `catalog_product_groups`, `keywords`, `labels`, `product_groups` FROM `BulkUpsertRequestCreate` WHERE 1;

--
-- INSERT template for table `BulkUpsertRequestCreate`
--
INSERT INTO `BulkUpsertRequestCreate`(`ad_groups`, `ads`, `campaigns`, `catalog_product_groups`, `keywords`, `labels`, `product_groups`) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `BulkUpsertRequestCreate`
--
UPDATE `BulkUpsertRequestCreate` SET `ad_groups` = ?, `ads` = ?, `campaigns` = ?, `catalog_product_groups` = ?, `keywords` = ?, `labels` = ?, `product_groups` = ? WHERE 1;

--
-- DELETE template for table `BulkUpsertRequestCreate`
--
DELETE FROM `BulkUpsertRequestCreate` WHERE 0;

