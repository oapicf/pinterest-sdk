--
-- "Pinterest REST API"
-- Prepared SQL queries for 'TitleKeywordsFilter' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'title_keywords_filter'
--
SELECT title_keywords FROM title_keywords_filter WHERE 1=1;

--
-- INSERT template for table 'title_keywords_filter'
--
INSERT INTO title_keywords_filter (title_keywords) VALUES (?);

--
-- UPDATE template for table 'title_keywords_filter'
--
UPDATE title_keywords_filter SET title_keywords = ? WHERE 1=2;

--
-- DELETE template for table 'title_keywords_filter'
--
DELETE FROM title_keywords_filter WHERE 1=2;

