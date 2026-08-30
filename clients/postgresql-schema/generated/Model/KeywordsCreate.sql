--
-- "Pinterest REST API"
-- Prepared SQL queries for 'KeywordsCreate' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'keywords_create'
--
SELECT keywords, parent_id FROM keywords_create WHERE 1=1;

--
-- INSERT template for table 'keywords_create'
--
INSERT INTO keywords_create (keywords, parent_id) VALUES (?, ?);

--
-- UPDATE template for table 'keywords_create'
--
UPDATE keywords_create SET keywords = ?, parent_id = ? WHERE 1=2;

--
-- DELETE template for table 'keywords_create'
--
DELETE FROM keywords_create WHERE 1=2;

