--
-- "Pinterest REST API"
-- Prepared SQL queries for 'TrendingKeywordsResponse' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'trending_keywords_response'
--
SELECT trends FROM trending_keywords_response WHERE 1=1;

--
-- INSERT template for table 'trending_keywords_response'
--
INSERT INTO trending_keywords_response (trends) VALUES (?);

--
-- UPDATE template for table 'trending_keywords_response'
--
UPDATE trending_keywords_response SET trends = ? WHERE 1=2;

--
-- DELETE template for table 'trending_keywords_response'
--
DELETE FROM trending_keywords_response WHERE 1=2;

