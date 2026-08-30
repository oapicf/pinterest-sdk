--
-- "Pinterest REST API"
-- Prepared SQL queries for 'TargetingSpecOptimal' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'targeting_spec_optimal'
--
SELECT age_bucket, apptype, audience_exclude, audience_include, gender, geo, geo_exclude, interest, locale, "location", location_exclude, maximum_age, minimum_age, shopping_retargeting, targeting_strategy FROM targeting_spec_optimal WHERE 1=1;

--
-- INSERT template for table 'targeting_spec_optimal'
--
INSERT INTO targeting_spec_optimal (age_bucket, apptype, audience_exclude, audience_include, gender, geo, geo_exclude, interest, locale, "location", location_exclude, maximum_age, minimum_age, shopping_retargeting, targeting_strategy) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'targeting_spec_optimal'
--
UPDATE targeting_spec_optimal SET age_bucket = ?, apptype = ?, audience_exclude = ?, audience_include = ?, gender = ?, geo = ?, geo_exclude = ?, interest = ?, locale = ?, "location" = ?, location_exclude = ?, maximum_age = ?, minimum_age = ?, shopping_retargeting = ?, targeting_strategy = ? WHERE 1=2;

--
-- DELETE template for table 'targeting_spec_optimal'
--
DELETE FROM targeting_spec_optimal WHERE 1=2;

