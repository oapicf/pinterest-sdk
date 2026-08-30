--
-- "Pinterest REST API"
-- Prepared SQL queries for 'TrendingKeywordDemographics' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'trending_keyword_demographics'
--
SELECT age_distribution, gender_distribution FROM trending_keyword_demographics WHERE 1=1;

--
-- INSERT template for table 'trending_keyword_demographics'
--
INSERT INTO trending_keyword_demographics (age_distribution, gender_distribution) VALUES (?, ?);

--
-- UPDATE template for table 'trending_keyword_demographics'
--
UPDATE trending_keyword_demographics SET age_distribution = ?, gender_distribution = ? WHERE 1=2;

--
-- DELETE template for table 'trending_keyword_demographics'
--
DELETE FROM trending_keyword_demographics WHERE 1=2;

