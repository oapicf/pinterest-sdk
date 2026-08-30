--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CatalogsFeedCredentials' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'catalogs_feed_credentials'
--
SELECT "password", username FROM catalogs_feed_credentials WHERE 1=1;

--
-- INSERT template for table 'catalogs_feed_credentials'
--
INSERT INTO catalogs_feed_credentials ("password", username) VALUES (?, ?);

--
-- UPDATE template for table 'catalogs_feed_credentials'
--
UPDATE catalogs_feed_credentials SET "password" = ?, username = ? WHERE 1=2;

--
-- DELETE template for table 'catalogs_feed_credentials'
--
DELETE FROM catalogs_feed_credentials WHERE 1=2;

