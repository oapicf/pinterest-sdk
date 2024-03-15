--
-- Pinterest REST API.
-- Prepared SQL queries for 'catalogs_product_groups_create_request' definition.
--


--
-- SELECT template for table `catalogs_product_groups_create_request`
--
SELECT `name`, `description`, `is_featured`, `filters`, `feed_id`, `catalog_type`, `catalog_id` FROM `catalogs_product_groups_create_request` WHERE 1;

--
-- INSERT template for table `catalogs_product_groups_create_request`
--
INSERT INTO `catalogs_product_groups_create_request`(`name`, `description`, `is_featured`, `filters`, `feed_id`, `catalog_type`, `catalog_id`) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `catalogs_product_groups_create_request`
--
UPDATE `catalogs_product_groups_create_request` SET `name` = ?, `description` = ?, `is_featured` = ?, `filters` = ?, `feed_id` = ?, `catalog_type` = ?, `catalog_id` = ? WHERE 1;

--
-- DELETE template for table `catalogs_product_groups_create_request`
--
DELETE FROM `catalogs_product_groups_create_request` WHERE 0;

