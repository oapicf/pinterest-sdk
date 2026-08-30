--
-- "Pinterest REST API"
-- Prepared SQL queries for 'ConversionEventResponse' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'conversion_event_response'
--
SELECT ad_account_id, conversion_event, conversion_tag_id, created_time, reporting_conversion_event FROM conversion_event_response WHERE 1=1;

--
-- INSERT template for table 'conversion_event_response'
--
INSERT INTO conversion_event_response (ad_account_id, conversion_event, conversion_tag_id, created_time, reporting_conversion_event) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table 'conversion_event_response'
--
UPDATE conversion_event_response SET ad_account_id = ?, conversion_event = ?, conversion_tag_id = ?, created_time = ?, reporting_conversion_event = ? WHERE 1=2;

--
-- DELETE template for table 'conversion_event_response'
--
DELETE FROM conversion_event_response WHERE 1=2;

