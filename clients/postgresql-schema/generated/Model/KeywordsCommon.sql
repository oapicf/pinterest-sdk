--
-- "Pinterest REST API"
-- Prepared SQL queries for 'KeywordsCommon' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'keywords_common'
--
SELECT bid, match_type, "value" FROM keywords_common WHERE 1=1;

--
-- INSERT template for table 'keywords_common'
--
INSERT INTO keywords_common (bid, match_type, "value") VALUES (?, ?, ?);

--
-- UPDATE template for table 'keywords_common'
--
UPDATE keywords_common SET bid = ?, match_type = ?, "value" = ? WHERE 1=2;

--
-- DELETE template for table 'keywords_common'
--
DELETE FROM keywords_common WHERE 1=2;

