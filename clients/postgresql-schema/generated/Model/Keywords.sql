--
-- "Pinterest REST API"
-- Prepared SQL queries for 'Keywords' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'keywords'
--
SELECT errors, keywords FROM keywords WHERE 1=1;

--
-- INSERT template for table 'keywords'
--
INSERT INTO keywords (errors, keywords) VALUES (?, ?);

--
-- UPDATE template for table 'keywords'
--
UPDATE keywords SET errors = ?, keywords = ? WHERE 1=2;

--
-- DELETE template for table 'keywords'
--
DELETE FROM keywords WHERE 1=2;

