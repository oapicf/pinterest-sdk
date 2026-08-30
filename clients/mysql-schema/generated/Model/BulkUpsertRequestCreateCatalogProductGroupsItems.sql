--
-- Pinterest REST API.
-- Prepared SQL queries for 'BulkUpsertRequestCreateCatalogProductGroupsItems' definition.
--


--
-- SELECT template for table `BulkUpsertRequestCreateCatalogProductGroupsItems`
--
SELECT `description`, `feed_id`, `filters`, `is_featured`, `name`, `catalog_id`, `catalog_type`, `country`, `locale` FROM `BulkUpsertRequestCreateCatalogProductGroupsItems` WHERE 1;

--
-- INSERT template for table `BulkUpsertRequestCreateCatalogProductGroupsItems`
--
INSERT INTO `BulkUpsertRequestCreateCatalogProductGroupsItems`(`description`, `feed_id`, `filters`, `is_featured`, `name`, `catalog_id`, `catalog_type`, `country`, `locale`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `BulkUpsertRequestCreateCatalogProductGroupsItems`
--
UPDATE `BulkUpsertRequestCreateCatalogProductGroupsItems` SET `description` = ?, `feed_id` = ?, `filters` = ?, `is_featured` = ?, `name` = ?, `catalog_id` = ?, `catalog_type` = ?, `country` = ?, `locale` = ? WHERE 1;

--
-- DELETE template for table `BulkUpsertRequestCreateCatalogProductGroupsItems`
--
DELETE FROM `BulkUpsertRequestCreateCatalogProductGroupsItems` WHERE 0;

