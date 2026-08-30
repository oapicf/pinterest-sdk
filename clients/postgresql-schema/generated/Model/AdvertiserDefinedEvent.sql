--
-- "Pinterest REST API"
-- Prepared SQL queries for 'AdvertiserDefinedEvent' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'advertiser_defined_event'
--
SELECT mapped_conversion_type, "name" FROM advertiser_defined_event WHERE 1=1;

--
-- INSERT template for table 'advertiser_defined_event'
--
INSERT INTO advertiser_defined_event (mapped_conversion_type, "name") VALUES (?, ?);

--
-- UPDATE template for table 'advertiser_defined_event'
--
UPDATE advertiser_defined_event SET mapped_conversion_type = ?, "name" = ? WHERE 1=2;

--
-- DELETE template for table 'advertiser_defined_event'
--
DELETE FROM advertiser_defined_event WHERE 1=2;

