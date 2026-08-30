--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CatalogsFeedIngestionInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'catalogs_feed_ingestion_info'
--
SELECT in_stock, out_of_stock, preorder FROM catalogs_feed_ingestion_info WHERE 1=1;

--
-- INSERT template for table 'catalogs_feed_ingestion_info'
--
INSERT INTO catalogs_feed_ingestion_info (in_stock, out_of_stock, preorder) VALUES (?, ?, ?);

--
-- UPDATE template for table 'catalogs_feed_ingestion_info'
--
UPDATE catalogs_feed_ingestion_info SET in_stock = ?, out_of_stock = ?, preorder = ? WHERE 1=2;

--
-- DELETE template for table 'catalogs_feed_ingestion_info'
--
DELETE FROM catalogs_feed_ingestion_info WHERE 1=2;

