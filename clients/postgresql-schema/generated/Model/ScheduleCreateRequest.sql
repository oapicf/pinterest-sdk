--
-- "Pinterest REST API"
-- Prepared SQL queries for 'ScheduleCreateRequest' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'schedule_create_request'
--
SELECT entity_id, entity_type, delta_value, end_timestamp, "name", schedule_action, schedule_status, schedule_type, start_timestamp FROM schedule_create_request WHERE 1=1;

--
-- INSERT template for table 'schedule_create_request'
--
INSERT INTO schedule_create_request (entity_id, entity_type, delta_value, end_timestamp, "name", schedule_action, schedule_status, schedule_type, start_timestamp) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'schedule_create_request'
--
UPDATE schedule_create_request SET entity_id = ?, entity_type = ?, delta_value = ?, end_timestamp = ?, "name" = ?, schedule_action = ?, schedule_status = ?, schedule_type = ?, start_timestamp = ? WHERE 1=2;

--
-- DELETE template for table 'schedule_create_request'
--
DELETE FROM schedule_create_request WHERE 1=2;

