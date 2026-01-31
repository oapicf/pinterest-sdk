--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsFeedIngestion' definition.
--


--
-- SELECT template for table `CatalogsFeedIngestion`
--
SELECT `created_at`, `feed_id`, `id`, `status` FROM `CatalogsFeedIngestion` WHERE 1;

--
-- INSERT template for table `CatalogsFeedIngestion`
--
INSERT INTO `CatalogsFeedIngestion`(`created_at`, `feed_id`, `id`, `status`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsFeedIngestion`
--
UPDATE `CatalogsFeedIngestion` SET `created_at` = ?, `feed_id` = ?, `id` = ?, `status` = ? WHERE 1;

--
-- DELETE template for table `CatalogsFeedIngestion`
--
DELETE FROM `CatalogsFeedIngestion` WHERE 0;

