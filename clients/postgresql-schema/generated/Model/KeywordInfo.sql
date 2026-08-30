--
-- "Pinterest REST API"
-- Prepared SQL queries for 'KeywordInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'keyword_info'
--
SELECT "name", pct_growth_mom FROM keyword_info WHERE 1=1;

--
-- INSERT template for table 'keyword_info'
--
INSERT INTO keyword_info ("name", pct_growth_mom) VALUES (?, ?);

--
-- UPDATE template for table 'keyword_info'
--
UPDATE keyword_info SET "name" = ?, pct_growth_mom = ? WHERE 1=2;

--
-- DELETE template for table 'keyword_info'
--
DELETE FROM keyword_info WHERE 1=2;

