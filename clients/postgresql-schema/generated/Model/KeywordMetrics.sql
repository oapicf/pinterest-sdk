--
-- "Pinterest REST API"
-- Prepared SQL queries for 'KeywordMetrics' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'keyword_metrics'
--
SELECT keyword_query_volume FROM keyword_metrics WHERE 1=1;

--
-- INSERT template for table 'keyword_metrics'
--
INSERT INTO keyword_metrics (keyword_query_volume) VALUES (?);

--
-- UPDATE template for table 'keyword_metrics'
--
UPDATE keyword_metrics SET keyword_query_volume = ? WHERE 1=2;

--
-- DELETE template for table 'keyword_metrics'
--
DELETE FROM keyword_metrics WHERE 1=2;

