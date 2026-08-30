--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsFeedProcessingResult' definition.
--


--
-- SELECT template for table `CatalogsFeedProcessingResult`
--
SELECT `created_at`, `id`, `ingestion_details`, `product_counts`, `status`, `updated_at`, `validation_details`, `video_counts` FROM `CatalogsFeedProcessingResult` WHERE 1;

--
-- INSERT template for table `CatalogsFeedProcessingResult`
--
INSERT INTO `CatalogsFeedProcessingResult`(`created_at`, `id`, `ingestion_details`, `product_counts`, `status`, `updated_at`, `validation_details`, `video_counts`) VALUES (?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsFeedProcessingResult`
--
UPDATE `CatalogsFeedProcessingResult` SET `created_at` = ?, `id` = ?, `ingestion_details` = ?, `product_counts` = ?, `status` = ?, `updated_at` = ?, `validation_details` = ?, `video_counts` = ? WHERE 1;

--
-- DELETE template for table `CatalogsFeedProcessingResult`
--
DELETE FROM `CatalogsFeedProcessingResult` WHERE 0;

