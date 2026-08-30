--
-- "Pinterest REST API"
-- Prepared SQL queries for 'BulkDownloadCreate' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'bulk_download_create'
--
SELECT campaign_filter, entity_ids, entity_types, output_format, updated_since FROM bulk_download_create WHERE 1=1;

--
-- INSERT template for table 'bulk_download_create'
--
INSERT INTO bulk_download_create (campaign_filter, entity_ids, entity_types, output_format, updated_since) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table 'bulk_download_create'
--
UPDATE bulk_download_create SET campaign_filter = ?, entity_ids = ?, entity_types = ?, output_format = ?, updated_since = ? WHERE 1=2;

--
-- DELETE template for table 'bulk_download_create'
--
DELETE FROM bulk_download_create WHERE 1=2;

