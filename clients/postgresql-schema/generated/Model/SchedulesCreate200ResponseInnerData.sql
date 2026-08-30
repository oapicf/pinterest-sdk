--
-- "Pinterest REST API"
-- Prepared SQL queries for 'schedules_create_200_response_inner_data' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'schedules_create_200_response_inner_data'
--
SELECT delta_value, end_timestamp, entity_id, entity_type, "name", schedule_action, schedule_id, schedule_status, schedule_type, start_timestamp, "id", exceptions FROM schedules_create_200_response_inner_data WHERE 1=1;

--
-- INSERT template for table 'schedules_create_200_response_inner_data'
--
INSERT INTO schedules_create_200_response_inner_data (delta_value, end_timestamp, entity_id, entity_type, "name", schedule_action, schedule_id, schedule_status, schedule_type, start_timestamp, "id", exceptions) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'schedules_create_200_response_inner_data'
--
UPDATE schedules_create_200_response_inner_data SET delta_value = ?, end_timestamp = ?, entity_id = ?, entity_type = ?, "name" = ?, schedule_action = ?, schedule_id = ?, schedule_status = ?, schedule_type = ?, start_timestamp = ?, "id" = ?, exceptions = ? WHERE 1=2;

--
-- DELETE template for table 'schedules_create_200_response_inner_data'
--
DELETE FROM schedules_create_200_response_inner_data WHERE 1=2;

