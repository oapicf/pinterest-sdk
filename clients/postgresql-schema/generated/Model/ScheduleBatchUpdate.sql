--
-- "Pinterest REST API"
-- Prepared SQL queries for 'ScheduleBatchUpdate' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'schedule_batch_update'
--
SELECT delta_value, end_timestamp, entity_id, entity_type, "id", "name", schedule_action, schedule_id, schedule_status, schedule_type, start_timestamp FROM schedule_batch_update WHERE 1=1;

--
-- INSERT template for table 'schedule_batch_update'
--
INSERT INTO schedule_batch_update (delta_value, end_timestamp, entity_id, entity_type, "id", "name", schedule_action, schedule_id, schedule_status, schedule_type, start_timestamp) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'schedule_batch_update'
--
UPDATE schedule_batch_update SET delta_value = ?, end_timestamp = ?, entity_id = ?, entity_type = ?, "id" = ?, "name" = ?, schedule_action = ?, schedule_id = ?, schedule_status = ?, schedule_type = ?, start_timestamp = ? WHERE 1=2;

--
-- DELETE template for table 'schedule_batch_update'
--
DELETE FROM schedule_batch_update WHERE 1=2;

