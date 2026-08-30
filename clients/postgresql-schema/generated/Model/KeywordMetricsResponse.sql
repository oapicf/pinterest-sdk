--
-- "Pinterest REST API"
-- Prepared SQL queries for 'KeywordMetricsResponse' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'keyword_metrics_response'
--
SELECT keyword, metrics FROM keyword_metrics_response WHERE 1=1;

--
-- INSERT template for table 'keyword_metrics_response'
--
INSERT INTO keyword_metrics_response (keyword, metrics) VALUES (?, ?);

--
-- UPDATE template for table 'keyword_metrics_response'
--
UPDATE keyword_metrics_response SET keyword = ?, metrics = ? WHERE 1=2;

--
-- DELETE template for table 'keyword_metrics_response'
--
DELETE FROM keyword_metrics_response WHERE 1=2;

