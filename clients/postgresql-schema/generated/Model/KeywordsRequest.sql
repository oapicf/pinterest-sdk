--
-- "Pinterest REST API"
-- Prepared SQL queries for 'KeywordsRequest' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'keywords_request'
--
SELECT keywords, parent_id FROM keywords_request WHERE 1=1;

--
-- INSERT template for table 'keywords_request'
--
INSERT INTO keywords_request (keywords, parent_id) VALUES (?, ?);

--
-- UPDATE template for table 'keywords_request'
--
UPDATE keywords_request SET keywords = ?, parent_id = ? WHERE 1=2;

--
-- DELETE template for table 'keywords_request'
--
DELETE FROM keywords_request WHERE 1=2;

