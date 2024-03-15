--
-- Pinterest REST API.
-- Prepared SQL queries for 'catalogs_product_groups_update_request' definition.
--


--
-- SELECT template for table `catalogs_product_groups_update_request`
--
SELECT `name`, `description`, `is_featured`, `filters`, `catalog_type` FROM `catalogs_product_groups_update_request` WHERE 1;

--
-- INSERT template for table `catalogs_product_groups_update_request`
--
INSERT INTO `catalogs_product_groups_update_request`(`name`, `description`, `is_featured`, `filters`, `catalog_type`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `catalogs_product_groups_update_request`
--
UPDATE `catalogs_product_groups_update_request` SET `name` = ?, `description` = ?, `is_featured` = ?, `filters` = ?, `catalog_type` = ? WHERE 1;

--
-- DELETE template for table `catalogs_product_groups_update_request`
--
DELETE FROM `catalogs_product_groups_update_request` WHERE 0;

