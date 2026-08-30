--
-- "Pinterest REST API"
-- Prepared SQL queries for 'Schedule' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'schedule'
--
SELECT delta_value, end_timestamp, entity_id, entity_type, "name", schedule_action, schedule_id, schedule_status, schedule_type, start_timestamp FROM schedule WHERE 1=1;

--
-- INSERT template for table 'schedule'
--
INSERT INTO schedule (delta_value, end_timestamp, entity_id, entity_type, "name", schedule_action, schedule_id, schedule_status, schedule_type, start_timestamp) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'schedule'
--
UPDATE schedule SET delta_value = ?, end_timestamp = ?, entity_id = ?, entity_type = ?, "name" = ?, schedule_action = ?, schedule_id = ?, schedule_status = ?, schedule_type = ?, start_timestamp = ? WHERE 1=2;

--
-- DELETE template for table 'schedule'
--
DELETE FROM schedule WHERE 1=2;

