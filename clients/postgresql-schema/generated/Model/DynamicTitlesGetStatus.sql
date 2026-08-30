--
-- "Pinterest REST API"
-- Prepared SQL queries for 'DynamicTitlesGetStatus' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'dynamic_titles_get_status'
--
SELECT generated_count, is_ready, reviewed_count FROM dynamic_titles_get_status WHERE 1=1;

--
-- INSERT template for table 'dynamic_titles_get_status'
--
INSERT INTO dynamic_titles_get_status (generated_count, is_ready, reviewed_count) VALUES (?, ?, ?);

--
-- UPDATE template for table 'dynamic_titles_get_status'
--
UPDATE dynamic_titles_get_status SET generated_count = ?, is_ready = ?, reviewed_count = ? WHERE 1=2;

--
-- DELETE template for table 'dynamic_titles_get_status'
--
DELETE FROM dynamic_titles_get_status WHERE 1=2;

