--
-- "Pinterest REST API"
-- Prepared SQL queries for 'TrendingKeyword' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'trending_keyword'
--
SELECT demographics, has_prediction, keyword, pct_growth_mom, pct_growth_wow, pct_growth_yoy, predicted_time_series, time_series FROM trending_keyword WHERE 1=1;

--
-- INSERT template for table 'trending_keyword'
--
INSERT INTO trending_keyword (demographics, has_prediction, keyword, pct_growth_mom, pct_growth_wow, pct_growth_yoy, predicted_time_series, time_series) VALUES (?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'trending_keyword'
--
UPDATE trending_keyword SET demographics = ?, has_prediction = ?, keyword = ?, pct_growth_mom = ?, pct_growth_wow = ?, pct_growth_yoy = ?, predicted_time_series = ?, time_series = ? WHERE 1=2;

--
-- DELETE template for table 'trending_keyword'
--
DELETE FROM trending_keyword WHERE 1=2;

