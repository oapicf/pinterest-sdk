--
-- "Pinterest REST API"
-- Prepared SQL queries for 'ConversionEventsUserDataProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'conversion_events_user_data_properties'
--
SELECT click_id, client_ip_address, client_user_agent, country, ct, "db", em, external_id, fn, ge, hashed_maids, "ln", partner_id, ph, st, zp FROM conversion_events_user_data_properties WHERE 1=1;

--
-- INSERT template for table 'conversion_events_user_data_properties'
--
INSERT INTO conversion_events_user_data_properties (click_id, client_ip_address, client_user_agent, country, ct, "db", em, external_id, fn, ge, hashed_maids, "ln", partner_id, ph, st, zp) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'conversion_events_user_data_properties'
--
UPDATE conversion_events_user_data_properties SET click_id = ?, client_ip_address = ?, client_user_agent = ?, country = ?, ct = ?, "db" = ?, em = ?, external_id = ?, fn = ?, ge = ?, hashed_maids = ?, "ln" = ?, partner_id = ?, ph = ?, st = ?, zp = ? WHERE 1=2;

--
-- DELETE template for table 'conversion_events_user_data_properties'
--
DELETE FROM conversion_events_user_data_properties WHERE 1=2;

