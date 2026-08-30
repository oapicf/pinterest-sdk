--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CatalogsFeedIngestionErrors' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'catalogs_feed_ingestion_errors'
--
SELECT account_flagged, fetch_google_sheet_not_shared, image_file_not_accessible, image_file_not_found, image_invalid_file, image_level_internal_error, image_malformed_url, large_product_count_decrease, line_level_internal_error FROM catalogs_feed_ingestion_errors WHERE 1=1;

--
-- INSERT template for table 'catalogs_feed_ingestion_errors'
--
INSERT INTO catalogs_feed_ingestion_errors (account_flagged, fetch_google_sheet_not_shared, image_file_not_accessible, image_file_not_found, image_invalid_file, image_level_internal_error, image_malformed_url, large_product_count_decrease, line_level_internal_error) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'catalogs_feed_ingestion_errors'
--
UPDATE catalogs_feed_ingestion_errors SET account_flagged = ?, fetch_google_sheet_not_shared = ?, image_file_not_accessible = ?, image_file_not_found = ?, image_invalid_file = ?, image_level_internal_error = ?, image_malformed_url = ?, large_product_count_decrease = ?, line_level_internal_error = ? WHERE 1=2;

--
-- DELETE template for table 'catalogs_feed_ingestion_errors'
--
DELETE FROM catalogs_feed_ingestion_errors WHERE 1=2;

