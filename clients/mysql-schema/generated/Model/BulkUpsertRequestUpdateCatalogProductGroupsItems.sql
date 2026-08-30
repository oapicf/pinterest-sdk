--
-- Pinterest REST API.
-- Prepared SQL queries for 'BulkUpsertRequestUpdateCatalogProductGroupsItems' definition.
--


--
-- SELECT template for table `BulkUpsertRequestUpdateCatalogProductGroupsItems`
--
SELECT `description`, `filters`, `is_featured`, `name`, `catalog_type`, `country`, `locale` FROM `BulkUpsertRequestUpdateCatalogProductGroupsItems` WHERE 1;

--
-- INSERT template for table `BulkUpsertRequestUpdateCatalogProductGroupsItems`
--
INSERT INTO `BulkUpsertRequestUpdateCatalogProductGroupsItems`(`description`, `filters`, `is_featured`, `name`, `catalog_type`, `country`, `locale`) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `BulkUpsertRequestUpdateCatalogProductGroupsItems`
--
UPDATE `BulkUpsertRequestUpdateCatalogProductGroupsItems` SET `description` = ?, `filters` = ?, `is_featured` = ?, `name` = ?, `catalog_type` = ?, `country` = ?, `locale` = ? WHERE 1;

--
-- DELETE template for table `BulkUpsertRequestUpdateCatalogProductGroupsItems`
--
DELETE FROM `BulkUpsertRequestUpdateCatalogProductGroupsItems` WHERE 0;

