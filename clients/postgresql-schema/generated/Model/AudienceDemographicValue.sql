--
-- "Pinterest REST API"
-- Prepared SQL queries for 'AudienceDemographicValue' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'audience_demographic_value'
--
SELECT "key", "name", ratio FROM audience_demographic_value WHERE 1=1;

--
-- INSERT template for table 'audience_demographic_value'
--
INSERT INTO audience_demographic_value ("key", "name", ratio) VALUES (?, ?, ?);

--
-- UPDATE template for table 'audience_demographic_value'
--
UPDATE audience_demographic_value SET "key" = ?, "name" = ?, ratio = ? WHERE 1=2;

--
-- DELETE template for table 'audience_demographic_value'
--
DELETE FROM audience_demographic_value WHERE 1=2;

