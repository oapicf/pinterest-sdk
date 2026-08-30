--
-- "Pinterest REST API"
-- Prepared SQL queries for 'DynamicTitlesProcessCSVError' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'dynamic_titles_process_csv_error'
--
SELECT error_type, "row_number" FROM dynamic_titles_process_csv_error WHERE 1=1;

--
-- INSERT template for table 'dynamic_titles_process_csv_error'
--
INSERT INTO dynamic_titles_process_csv_error (error_type, "row_number") VALUES (?, ?);

--
-- UPDATE template for table 'dynamic_titles_process_csv_error'
--
UPDATE dynamic_titles_process_csv_error SET error_type = ?, "row_number" = ? WHERE 1=2;

--
-- DELETE template for table 'dynamic_titles_process_csv_error'
--
DELETE FROM dynamic_titles_process_csv_error WHERE 1=2;

