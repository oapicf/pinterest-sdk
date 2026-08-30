--
-- "Pinterest REST API"
-- Prepared SQL queries for 'lead_forms_create_200_response_items_inner' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'lead_forms_create_200_response_items_inner'
--
SELECT "data", exceptions FROM lead_forms_create_200_response_items_inner WHERE 1=1;

--
-- INSERT template for table 'lead_forms_create_200_response_items_inner'
--
INSERT INTO lead_forms_create_200_response_items_inner ("data", exceptions) VALUES (?, ?);

--
-- UPDATE template for table 'lead_forms_create_200_response_items_inner'
--
UPDATE lead_forms_create_200_response_items_inner SET "data" = ?, exceptions = ? WHERE 1=2;

--
-- DELETE template for table 'lead_forms_create_200_response_items_inner'
--
DELETE FROM lead_forms_create_200_response_items_inner WHERE 1=2;

