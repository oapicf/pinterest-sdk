--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CustomConversionEventMetrics' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'custom_conversion_event_metrics'
--
SELECT custom_event_metrics_type, custom_event_name FROM custom_conversion_event_metrics WHERE 1=1;

--
-- INSERT template for table 'custom_conversion_event_metrics'
--
INSERT INTO custom_conversion_event_metrics (custom_event_metrics_type, custom_event_name) VALUES (?, ?);

--
-- UPDATE template for table 'custom_conversion_event_metrics'
--
UPDATE custom_conversion_event_metrics SET custom_event_metrics_type = ?, custom_event_name = ? WHERE 1=2;

--
-- DELETE template for table 'custom_conversion_event_metrics'
--
DELETE FROM custom_conversion_event_metrics WHERE 1=2;

