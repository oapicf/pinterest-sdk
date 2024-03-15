--
-- Pinterest REST API.
-- Prepared SQL queries for 'catalogs_product_groups_list_200_response_allOf_items_inner' definition.
--


--
-- SELECT template for table `catalogs_product_groups_list_200_response_allOf_items_inner`
--
SELECT `id`, `name`, `description`, `filters`, `is_featured`, `type`, `status`, `created_at`, `updated_at`, `feed_id`, `catalog_type`, `catalog_id` FROM `catalogs_product_groups_list_200_response_allOf_items_inner` WHERE 1;

--
-- INSERT template for table `catalogs_product_groups_list_200_response_allOf_items_inner`
--
INSERT INTO `catalogs_product_groups_list_200_response_allOf_items_inner`(`id`, `name`, `description`, `filters`, `is_featured`, `type`, `status`, `created_at`, `updated_at`, `feed_id`, `catalog_type`, `catalog_id`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `catalogs_product_groups_list_200_response_allOf_items_inner`
--
UPDATE `catalogs_product_groups_list_200_response_allOf_items_inner` SET `id` = ?, `name` = ?, `description` = ?, `filters` = ?, `is_featured` = ?, `type` = ?, `status` = ?, `created_at` = ?, `updated_at` = ?, `feed_id` = ?, `catalog_type` = ?, `catalog_id` = ? WHERE 1;

--
-- DELETE template for table `catalogs_product_groups_list_200_response_allOf_items_inner`
--
DELETE FROM `catalogs_product_groups_list_200_response_allOf_items_inner` WHERE 0;

