--
-- "Pinterest REST API"
-- Prepared SQL queries for 'KeywordUpdateItem' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'keyword_update_item'
--
SELECT archived, bid, "id" FROM keyword_update_item WHERE 1=1;

--
-- INSERT template for table 'keyword_update_item'
--
INSERT INTO keyword_update_item (archived, bid, "id") VALUES (?, ?, ?);

--
-- UPDATE template for table 'keyword_update_item'
--
UPDATE keyword_update_item SET archived = ?, bid = ?, "id" = ? WHERE 1=2;

--
-- DELETE template for table 'keyword_update_item'
--
DELETE FROM keyword_update_item WHERE 1=2;

