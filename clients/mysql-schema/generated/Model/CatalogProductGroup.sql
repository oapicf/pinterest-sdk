--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogProductGroup' definition.
--


--
-- SELECT template for table `CatalogProductGroup`
--
SELECT `id`, `merchant_id`, `name`, `filters`, `filter_v2`, `type`, `status`, `feed_profile_id`, `created_at`, `last_update`, `product_count`, `featured_position` FROM `CatalogProductGroup` WHERE 1;

--
-- INSERT template for table `CatalogProductGroup`
--
INSERT INTO `CatalogProductGroup`(`id`, `merchant_id`, `name`, `filters`, `filter_v2`, `type`, `status`, `feed_profile_id`, `created_at`, `last_update`, `product_count`, `featured_position`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CatalogProductGroup`
--
UPDATE `CatalogProductGroup` SET `id` = ?, `merchant_id` = ?, `name` = ?, `filters` = ?, `filter_v2` = ?, `type` = ?, `status` = ?, `feed_profile_id` = ?, `created_at` = ?, `last_update` = ?, `product_count` = ?, `featured_position` = ? WHERE 1;

--
-- DELETE template for table `CatalogProductGroup`
--
DELETE FROM `CatalogProductGroup` WHERE 0;

