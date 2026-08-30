--
-- "Pinterest REST API"
-- Prepared SQL queries for 'DeleteMemberAccessResultsResponseArray' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'delete_member_access_results_response_array'
--
SELECT items FROM delete_member_access_results_response_array WHERE 1=1;

--
-- INSERT template for table 'delete_member_access_results_response_array'
--
INSERT INTO delete_member_access_results_response_array (items) VALUES (?);

--
-- UPDATE template for table 'delete_member_access_results_response_array'
--
UPDATE delete_member_access_results_response_array SET items = ? WHERE 1=2;

--
-- DELETE template for table 'delete_member_access_results_response_array'
--
DELETE FROM delete_member_access_results_response_array WHERE 1=2;

