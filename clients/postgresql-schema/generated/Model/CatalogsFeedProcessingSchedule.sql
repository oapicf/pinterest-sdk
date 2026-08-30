--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CatalogsFeedProcessingSchedule' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'catalogs_feed_processing_schedule'
--
SELECT "time", timezone FROM catalogs_feed_processing_schedule WHERE 1=1;

--
-- INSERT template for table 'catalogs_feed_processing_schedule'
--
INSERT INTO catalogs_feed_processing_schedule ("time", timezone) VALUES (?, ?);

--
-- UPDATE template for table 'catalogs_feed_processing_schedule'
--
UPDATE catalogs_feed_processing_schedule SET "time" = ?, timezone = ? WHERE 1=2;

--
-- DELETE template for table 'catalogs_feed_processing_schedule'
--
DELETE FROM catalogs_feed_processing_schedule WHERE 1=2;

