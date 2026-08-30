--
-- "Pinterest REST API"
-- Prepared SQL queries for 'ScheduleCreateRequestAllOf1' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'schedule_create_request_all_of1'
--
SELECT entity_id, entity_type FROM schedule_create_request_all_of1 WHERE 1=1;

--
-- INSERT template for table 'schedule_create_request_all_of1'
--
INSERT INTO schedule_create_request_all_of1 (entity_id, entity_type) VALUES (?, ?);

--
-- UPDATE template for table 'schedule_create_request_all_of1'
--
UPDATE schedule_create_request_all_of1 SET entity_id = ?, entity_type = ? WHERE 1=2;

--
-- DELETE template for table 'schedule_create_request_all_of1'
--
DELETE FROM schedule_create_request_all_of1 WHERE 1=2;

