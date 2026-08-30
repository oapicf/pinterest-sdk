--
-- "Pinterest REST API"
-- Prepared SQL queries for 'ScheduleCreate' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'schedule_create'
--
SELECT delta_value, end_timestamp, entity_id, entity_type, "name", schedule_action, schedule_status, schedule_type, start_timestamp FROM schedule_create WHERE 1=1;

--
-- INSERT template for table 'schedule_create'
--
INSERT INTO schedule_create (delta_value, end_timestamp, entity_id, entity_type, "name", schedule_action, schedule_status, schedule_type, start_timestamp) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'schedule_create'
--
UPDATE schedule_create SET delta_value = ?, end_timestamp = ?, entity_id = ?, entity_type = ?, "name" = ?, schedule_action = ?, schedule_status = ?, schedule_type = ?, start_timestamp = ? WHERE 1=2;

--
-- DELETE template for table 'schedule_create'
--
DELETE FROM schedule_create WHERE 1=2;

