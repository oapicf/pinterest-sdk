--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CatalogsFeedIngestion' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'catalogs_feed_ingestion'
--
SELECT created_at, feed_id, "id", status FROM catalogs_feed_ingestion WHERE 1=1;

--
-- INSERT template for table 'catalogs_feed_ingestion'
--
INSERT INTO catalogs_feed_ingestion (created_at, feed_id, "id", status) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'catalogs_feed_ingestion'
--
UPDATE catalogs_feed_ingestion SET created_at = ?, feed_id = ?, "id" = ?, status = ? WHERE 1=2;

--
-- DELETE template for table 'catalogs_feed_ingestion'
--
DELETE FROM catalogs_feed_ingestion WHERE 1=2;

