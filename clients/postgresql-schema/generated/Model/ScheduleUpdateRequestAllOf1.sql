--
-- "Pinterest REST API"
-- Prepared SQL queries for 'ScheduleUpdateRequestAllOf1' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'schedule_update_request_all_of1'
--
SELECT entity_id, entity_type, "id" FROM schedule_update_request_all_of1 WHERE 1=1;

--
-- INSERT template for table 'schedule_update_request_all_of1'
--
INSERT INTO schedule_update_request_all_of1 (entity_id, entity_type, "id") VALUES (?, ?, ?);

--
-- UPDATE template for table 'schedule_update_request_all_of1'
--
UPDATE schedule_update_request_all_of1 SET entity_id = ?, entity_type = ?, "id" = ? WHERE 1=2;

--
-- DELETE template for table 'schedule_update_request_all_of1'
--
DELETE FROM schedule_update_request_all_of1 WHERE 1=2;

