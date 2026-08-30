--
-- "Pinterest REST API"
-- Prepared SQL queries for 'TrendingTopic' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'trending_topic'
--
SELECT description, "id", percent_growth_mom, pins, related_interests, related_searches, time_series, title FROM trending_topic WHERE 1=1;

--
-- INSERT template for table 'trending_topic'
--
INSERT INTO trending_topic (description, "id", percent_growth_mom, pins, related_interests, related_searches, time_series, title) VALUES (?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'trending_topic'
--
UPDATE trending_topic SET description = ?, "id" = ?, percent_growth_mom = ?, pins = ?, related_interests = ?, related_searches = ?, time_series = ?, title = ? WHERE 1=2;

--
-- DELETE template for table 'trending_topic'
--
DELETE FROM trending_topic WHERE 1=2;

