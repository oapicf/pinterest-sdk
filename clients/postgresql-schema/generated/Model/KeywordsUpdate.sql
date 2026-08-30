--
-- "Pinterest REST API"
-- Prepared SQL queries for 'KeywordsUpdate' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'keywords_update'
--
SELECT keywords FROM keywords_update WHERE 1=1;

--
-- INSERT template for table 'keywords_update'
--
INSERT INTO keywords_update (keywords) VALUES (?);

--
-- UPDATE template for table 'keywords_update'
--
UPDATE keywords_update SET keywords = ? WHERE 1=2;

--
-- DELETE template for table 'keywords_update'
--
DELETE FROM keywords_update WHERE 1=2;

