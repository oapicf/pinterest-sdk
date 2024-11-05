--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsFeedIngestion' definition.
--


--
-- SELECT template for table `CatalogsFeedIngestion`
--
SELECT `id`, `feed_id`, `created_at`, `status` FROM `CatalogsFeedIngestion` WHERE 1;

--
-- INSERT template for table `CatalogsFeedIngestion`
--
INSERT INTO `CatalogsFeedIngestion`(`id`, `feed_id`, `created_at`, `status`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsFeedIngestion`
--
UPDATE `CatalogsFeedIngestion` SET `id` = ?, `feed_id` = ?, `created_at` = ?, `status` = ? WHERE 1;

--
-- DELETE template for table `CatalogsFeedIngestion`
--
DELETE FROM `CatalogsFeedIngestion` WHERE 0;

