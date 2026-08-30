--
-- "Pinterest REST API"
-- Prepared SQL queries for 'ScheduleUpdateRequest' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'schedule_update_request'
--
SELECT entity_id, entity_type, "id", delta_value, end_timestamp, "name", schedule_action, schedule_status, schedule_type, start_timestamp FROM schedule_update_request WHERE 1=1;

--
-- INSERT template for table 'schedule_update_request'
--
INSERT INTO schedule_update_request (entity_id, entity_type, "id", delta_value, end_timestamp, "name", schedule_action, schedule_status, schedule_type, start_timestamp) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'schedule_update_request'
--
UPDATE schedule_update_request SET entity_id = ?, entity_type = ?, "id" = ?, delta_value = ?, end_timestamp = ?, "name" = ?, schedule_action = ?, schedule_status = ?, schedule_type = ?, start_timestamp = ? WHERE 1=2;

--
-- DELETE template for table 'schedule_update_request'
--
DELETE FROM schedule_update_request WHERE 1=2;

