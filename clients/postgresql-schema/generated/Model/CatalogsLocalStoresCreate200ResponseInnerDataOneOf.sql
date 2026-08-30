--
-- "Pinterest REST API"
-- Prepared SQL queries for 'catalogs_local_stores_create_200_response_inner_data_oneOf' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'catalogs_local_stores_create_200_response_inner_data_one_of'
--
SELECT "id", exceptions FROM catalogs_local_stores_create_200_response_inner_data_one_of WHERE 1=1;

--
-- INSERT template for table 'catalogs_local_stores_create_200_response_inner_data_one_of'
--
INSERT INTO catalogs_local_stores_create_200_response_inner_data_one_of ("id", exceptions) VALUES (?, ?);

--
-- UPDATE template for table 'catalogs_local_stores_create_200_response_inner_data_one_of'
--
UPDATE catalogs_local_stores_create_200_response_inner_data_one_of SET "id" = ?, exceptions = ? WHERE 1=2;

--
-- DELETE template for table 'catalogs_local_stores_create_200_response_inner_data_one_of'
--
DELETE FROM catalogs_local_stores_create_200_response_inner_data_one_of WHERE 1=2;

