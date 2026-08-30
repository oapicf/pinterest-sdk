--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CatalogsFeedProcessingResult' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'catalogs_feed_processing_result'
--
SELECT created_at, "id", ingestion_details, product_counts, status, updated_at, validation_details, video_counts FROM catalogs_feed_processing_result WHERE 1=1;

--
-- INSERT template for table 'catalogs_feed_processing_result'
--
INSERT INTO catalogs_feed_processing_result (created_at, "id", ingestion_details, product_counts, status, updated_at, validation_details, video_counts) VALUES (?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'catalogs_feed_processing_result'
--
UPDATE catalogs_feed_processing_result SET created_at = ?, "id" = ?, ingestion_details = ?, product_counts = ?, status = ?, updated_at = ?, validation_details = ?, video_counts = ? WHERE 1=2;

--
-- DELETE template for table 'catalogs_feed_processing_result'
--
DELETE FROM catalogs_feed_processing_result WHERE 1=2;

