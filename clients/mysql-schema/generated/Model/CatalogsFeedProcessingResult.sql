--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsFeedProcessingResult' definition.
--


--
-- SELECT template for table `CatalogsFeedProcessingResult`
--
SELECT `created_at`, `id`, `updated_at`, `ingestion_details`, `status`, `product_counts`, `validation_details` FROM `CatalogsFeedProcessingResult` WHERE 1;

--
-- INSERT template for table `CatalogsFeedProcessingResult`
--
INSERT INTO `CatalogsFeedProcessingResult`(`created_at`, `id`, `updated_at`, `ingestion_details`, `status`, `product_counts`, `validation_details`) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsFeedProcessingResult`
--
UPDATE `CatalogsFeedProcessingResult` SET `created_at` = ?, `id` = ?, `updated_at` = ?, `ingestion_details` = ?, `status` = ?, `product_counts` = ?, `validation_details` = ? WHERE 1;

--
-- DELETE template for table `CatalogsFeedProcessingResult`
--
DELETE FROM `CatalogsFeedProcessingResult` WHERE 0;

