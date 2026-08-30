--
-- "Pinterest REST API"
-- Prepared SQL queries for 'AudienceInsights' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'audience_insights'
--
SELECT categories, "date", demographics, "size", size_is_upper_bound, "type" FROM audience_insights WHERE 1=1;

--
-- INSERT template for table 'audience_insights'
--
INSERT INTO audience_insights (categories, "date", demographics, "size", size_is_upper_bound, "type") VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'audience_insights'
--
UPDATE audience_insights SET categories = ?, "date" = ?, demographics = ?, "size" = ?, size_is_upper_bound = ?, "type" = ? WHERE 1=2;

--
-- DELETE template for table 'audience_insights'
--
DELETE FROM audience_insights WHERE 1=2;

