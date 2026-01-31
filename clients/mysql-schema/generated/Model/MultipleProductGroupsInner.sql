--
-- Pinterest REST API.
-- Prepared SQL queries for 'multiple_product_groups_inner' definition.
--


--
-- SELECT template for table `multiple_product_groups_inner`
--
SELECT `description`, `feed_id`, `filters`, `is_featured`, `name`, `catalog_id`, `catalog_type`, `country`, `locale` FROM `multiple_product_groups_inner` WHERE 1;

--
-- INSERT template for table `multiple_product_groups_inner`
--
INSERT INTO `multiple_product_groups_inner`(`description`, `feed_id`, `filters`, `is_featured`, `name`, `catalog_id`, `catalog_type`, `country`, `locale`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `multiple_product_groups_inner`
--
UPDATE `multiple_product_groups_inner` SET `description` = ?, `feed_id` = ?, `filters` = ?, `is_featured` = ?, `name` = ?, `catalog_id` = ?, `catalog_type` = ?, `country` = ?, `locale` = ? WHERE 1;

--
-- DELETE template for table `multiple_product_groups_inner`
--
DELETE FROM `multiple_product_groups_inner` WHERE 0;

