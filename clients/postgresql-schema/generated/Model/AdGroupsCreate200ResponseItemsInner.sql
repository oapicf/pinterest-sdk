--
-- "Pinterest REST API"
-- Prepared SQL queries for 'ad_groups_create_200_response_items_inner' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'ad_groups_create_200_response_items_inner'
--
SELECT "data", exceptions FROM ad_groups_create_200_response_items_inner WHERE 1=1;

--
-- INSERT template for table 'ad_groups_create_200_response_items_inner'
--
INSERT INTO ad_groups_create_200_response_items_inner ("data", exceptions) VALUES (?, ?);

--
-- UPDATE template for table 'ad_groups_create_200_response_items_inner'
--
UPDATE ad_groups_create_200_response_items_inner SET "data" = ?, exceptions = ? WHERE 1=2;

--
-- DELETE template for table 'ad_groups_create_200_response_items_inner'
--
DELETE FROM ad_groups_create_200_response_items_inner WHERE 1=2;

