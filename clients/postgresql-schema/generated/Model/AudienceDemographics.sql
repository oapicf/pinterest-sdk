--
-- "Pinterest REST API"
-- Prepared SQL queries for 'AudienceDemographics' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'audience_demographics'
--
SELECT ages, countries, devices, genders, metros FROM audience_demographics WHERE 1=1;

--
-- INSERT template for table 'audience_demographics'
--
INSERT INTO audience_demographics (ages, countries, devices, genders, metros) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table 'audience_demographics'
--
UPDATE audience_demographics SET ages = ?, countries = ?, devices = ?, genders = ?, metros = ? WHERE 1=2;

--
-- DELETE template for table 'audience_demographics'
--
DELETE FROM audience_demographics WHERE 1=2;

