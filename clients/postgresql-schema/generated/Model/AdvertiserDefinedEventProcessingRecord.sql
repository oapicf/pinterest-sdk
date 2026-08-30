--
-- "Pinterest REST API"
-- Prepared SQL queries for 'AdvertiserDefinedEventProcessingRecord' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'advertiser_defined_event_processing_record'
--
SELECT exceptions, "name", status FROM advertiser_defined_event_processing_record WHERE 1=1;

--
-- INSERT template for table 'advertiser_defined_event_processing_record'
--
INSERT INTO advertiser_defined_event_processing_record (exceptions, "name", status) VALUES (?, ?, ?);

--
-- UPDATE template for table 'advertiser_defined_event_processing_record'
--
UPDATE advertiser_defined_event_processing_record SET exceptions = ?, "name" = ?, status = ? WHERE 1=2;

--
-- DELETE template for table 'advertiser_defined_event_processing_record'
--
DELETE FROM advertiser_defined_event_processing_record WHERE 1=2;

