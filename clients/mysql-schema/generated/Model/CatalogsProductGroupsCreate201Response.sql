--
-- Pinterest REST API.
-- Prepared SQL queries for 'catalogs_product_groups_create_201_response' definition.
--


--
-- SELECT template for table `catalogs_product_groups_create_201_response`
--
SELECT `id`, `name`, `description`, `filters`, `is_featured`, `type`, `status`, `created_at`, `updated_at`, `feed_id`, `catalog_type`, `catalog_id` FROM `catalogs_product_groups_create_201_response` WHERE 1;

--
-- INSERT template for table `catalogs_product_groups_create_201_response`
--
INSERT INTO `catalogs_product_groups_create_201_response`(`id`, `name`, `description`, `filters`, `is_featured`, `type`, `status`, `created_at`, `updated_at`, `feed_id`, `catalog_type`, `catalog_id`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `catalogs_product_groups_create_201_response`
--
UPDATE `catalogs_product_groups_create_201_response` SET `id` = ?, `name` = ?, `description` = ?, `filters` = ?, `is_featured` = ?, `type` = ?, `status` = ?, `created_at` = ?, `updated_at` = ?, `feed_id` = ?, `catalog_type` = ?, `catalog_id` = ? WHERE 1;

--
-- DELETE template for table `catalogs_product_groups_create_201_response`
--
DELETE FROM `catalogs_product_groups_create_201_response` WHERE 0;

