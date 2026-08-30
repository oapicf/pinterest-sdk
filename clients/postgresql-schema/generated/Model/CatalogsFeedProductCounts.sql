--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CatalogsFeedProductCounts' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'catalogs_feed_product_counts'
--
SELECT ingested, original FROM catalogs_feed_product_counts WHERE 1=1;

--
-- INSERT template for table 'catalogs_feed_product_counts'
--
INSERT INTO catalogs_feed_product_counts (ingested, original) VALUES (?, ?);

--
-- UPDATE template for table 'catalogs_feed_product_counts'
--
UPDATE catalogs_feed_product_counts SET ingested = ?, original = ? WHERE 1=2;

--
-- DELETE template for table 'catalogs_feed_product_counts'
--
DELETE FROM catalogs_feed_product_counts WHERE 1=2;

