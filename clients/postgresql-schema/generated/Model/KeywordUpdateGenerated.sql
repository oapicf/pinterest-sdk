--
-- "Pinterest REST API"
-- Prepared SQL queries for 'KeywordUpdateGenerated' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'keyword_update_generated'
--
SELECT archived, bid, "id" FROM keyword_update_generated WHERE 1=1;

--
-- INSERT template for table 'keyword_update_generated'
--
INSERT INTO keyword_update_generated (archived, bid, "id") VALUES (?, ?, ?);

--
-- UPDATE template for table 'keyword_update_generated'
--
UPDATE keyword_update_generated SET archived = ?, bid = ?, "id" = ? WHERE 1=2;

--
-- DELETE template for table 'keyword_update_generated'
--
DELETE FROM keyword_update_generated WHERE 1=2;

