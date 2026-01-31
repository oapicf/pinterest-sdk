--
-- Pinterest REST API.
-- Prepared SQL queries for 'catalogs_product_groups_update_request' definition.
--


--
-- SELECT template for table `catalogs_product_groups_update_request`
--
SELECT `description`, `filters`, `is_featured`, `name`, `catalog_type`, `country`, `locale` FROM `catalogs_product_groups_update_request` WHERE 1;

--
-- INSERT template for table `catalogs_product_groups_update_request`
--
INSERT INTO `catalogs_product_groups_update_request`(`description`, `filters`, `is_featured`, `name`, `catalog_type`, `country`, `locale`) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `catalogs_product_groups_update_request`
--
UPDATE `catalogs_product_groups_update_request` SET `description` = ?, `filters` = ?, `is_featured` = ?, `name` = ?, `catalog_type` = ?, `country` = ?, `locale` = ? WHERE 1;

--
-- DELETE template for table `catalogs_product_groups_update_request`
--
DELETE FROM `catalogs_product_groups_update_request` WHERE 0;

