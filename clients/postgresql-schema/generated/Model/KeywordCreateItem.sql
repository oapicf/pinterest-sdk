--
-- "Pinterest REST API"
-- Prepared SQL queries for 'KeywordCreateItem' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'keyword_create_item'
--
SELECT bid, match_type, "value" FROM keyword_create_item WHERE 1=1;

--
-- INSERT template for table 'keyword_create_item'
--
INSERT INTO keyword_create_item (bid, match_type, "value") VALUES (?, ?, ?);

--
-- UPDATE template for table 'keyword_create_item'
--
UPDATE keyword_create_item SET bid = ?, match_type = ?, "value" = ? WHERE 1=2;

--
-- DELETE template for table 'keyword_create_item'
--
DELETE FROM keyword_create_item WHERE 1=2;

