--
-- "Pinterest REST API"
-- Prepared SQL queries for 'ConversionEvents' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'conversion_events'
--
SELECT events, num_events_processed, num_events_received FROM conversion_events WHERE 1=1;

--
-- INSERT template for table 'conversion_events'
--
INSERT INTO conversion_events (events, num_events_processed, num_events_received) VALUES (?, ?, ?);

--
-- UPDATE template for table 'conversion_events'
--
UPDATE conversion_events SET events = ?, num_events_processed = ?, num_events_received = ? WHERE 1=2;

--
-- DELETE template for table 'conversion_events'
--
DELETE FROM conversion_events WHERE 1=2;

