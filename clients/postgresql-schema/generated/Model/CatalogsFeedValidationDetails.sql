--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CatalogsFeedValidationDetails' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'catalogs_feed_validation_details'
--
SELECT errors, warnings FROM catalogs_feed_validation_details WHERE 1=1;

--
-- INSERT template for table 'catalogs_feed_validation_details'
--
INSERT INTO catalogs_feed_validation_details (errors, warnings) VALUES (?, ?);

--
-- UPDATE template for table 'catalogs_feed_validation_details'
--
UPDATE catalogs_feed_validation_details SET errors = ?, warnings = ? WHERE 1=2;

--
-- DELETE template for table 'catalogs_feed_validation_details'
--
DELETE FROM catalogs_feed_validation_details WHERE 1=2;

