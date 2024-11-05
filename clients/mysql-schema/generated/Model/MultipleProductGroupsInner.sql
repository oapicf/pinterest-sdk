--
-- Pinterest REST API.
-- Prepared SQL queries for 'multiple_product_groups_inner' definition.
--


--
-- SELECT template for table `multiple_product_groups_inner`
--
SELECT `name`, `description`, `is_featured`, `filters`, `feed_id`, `catalog_type`, `catalog_id`, `country`, `locale` FROM `multiple_product_groups_inner` WHERE 1;

--
-- INSERT template for table `multiple_product_groups_inner`
--
INSERT INTO `multiple_product_groups_inner`(`name`, `description`, `is_featured`, `filters`, `feed_id`, `catalog_type`, `catalog_id`, `country`, `locale`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `multiple_product_groups_inner`
--
UPDATE `multiple_product_groups_inner` SET `name` = ?, `description` = ?, `is_featured` = ?, `filters` = ?, `feed_id` = ?, `catalog_type` = ?, `catalog_id` = ?, `country` = ?, `locale` = ? WHERE 1;

--
-- DELETE template for table `multiple_product_groups_inner`
--
DELETE FROM `multiple_product_groups_inner` WHERE 0;

