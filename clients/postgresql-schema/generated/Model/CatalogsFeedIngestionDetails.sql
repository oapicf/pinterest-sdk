--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CatalogsFeedIngestionDetails' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'catalogs_feed_ingestion_details'
--
SELECT errors, info, warnings FROM catalogs_feed_ingestion_details WHERE 1=1;

--
-- INSERT template for table 'catalogs_feed_ingestion_details'
--
INSERT INTO catalogs_feed_ingestion_details (errors, info, warnings) VALUES (?, ?, ?);

--
-- UPDATE template for table 'catalogs_feed_ingestion_details'
--
UPDATE catalogs_feed_ingestion_details SET errors = ?, info = ?, warnings = ? WHERE 1=2;

--
-- DELETE template for table 'catalogs_feed_ingestion_details'
--
DELETE FROM catalogs_feed_ingestion_details WHERE 1=2;

