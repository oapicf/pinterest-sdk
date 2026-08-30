--
-- "Pinterest REST API"
-- Prepared SQL queries for 'schedules_create_200_response_inner_data_oneOf' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'schedules_create_200_response_inner_data_one_of'
--
SELECT "id", schedule_id, exceptions FROM schedules_create_200_response_inner_data_one_of WHERE 1=1;

--
-- INSERT template for table 'schedules_create_200_response_inner_data_one_of'
--
INSERT INTO schedules_create_200_response_inner_data_one_of ("id", schedule_id, exceptions) VALUES (?, ?, ?);

--
-- UPDATE template for table 'schedules_create_200_response_inner_data_one_of'
--
UPDATE schedules_create_200_response_inner_data_one_of SET "id" = ?, schedule_id = ?, exceptions = ? WHERE 1=2;

--
-- DELETE template for table 'schedules_create_200_response_inner_data_one_of'
--
DELETE FROM schedules_create_200_response_inner_data_one_of WHERE 1=2;

