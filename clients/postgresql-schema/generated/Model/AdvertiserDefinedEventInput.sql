--
-- "Pinterest REST API"
-- Prepared SQL queries for 'AdvertiserDefinedEventInput' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'advertiser_defined_event_input'
--
SELECT mapped_conversion_type, "name" FROM advertiser_defined_event_input WHERE 1=1;

--
-- INSERT template for table 'advertiser_defined_event_input'
--
INSERT INTO advertiser_defined_event_input (mapped_conversion_type, "name") VALUES (?, ?);

--
-- UPDATE template for table 'advertiser_defined_event_input'
--
UPDATE advertiser_defined_event_input SET mapped_conversion_type = ?, "name" = ? WHERE 1=2;

--
-- DELETE template for table 'advertiser_defined_event_input'
--
DELETE FROM advertiser_defined_event_input WHERE 1=2;

