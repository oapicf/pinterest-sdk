--
-- "Pinterest REST API"
-- Prepared SQL queries for 'DynamicTitlesProcessCSV' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'dynamic_titles_process_csv'
--
SELECT errors, status FROM dynamic_titles_process_csv WHERE 1=1;

--
-- INSERT template for table 'dynamic_titles_process_csv'
--
INSERT INTO dynamic_titles_process_csv (errors, status) VALUES (?, ?);

--
-- UPDATE template for table 'dynamic_titles_process_csv'
--
UPDATE dynamic_titles_process_csv SET errors = ?, status = ? WHERE 1=2;

--
-- DELETE template for table 'dynamic_titles_process_csv'
--
DELETE FROM dynamic_titles_process_csv WHERE 1=2;

