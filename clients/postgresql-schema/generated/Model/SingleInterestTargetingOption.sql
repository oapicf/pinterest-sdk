--
-- "Pinterest REST API"
-- Prepared SQL queries for 'SingleInterestTargetingOption' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'single_interest_targeting_option'
--
SELECT child_interests, "id", "level", "name" FROM single_interest_targeting_option WHERE 1=1;

--
-- INSERT template for table 'single_interest_targeting_option'
--
INSERT INTO single_interest_targeting_option (child_interests, "id", "level", "name") VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'single_interest_targeting_option'
--
UPDATE single_interest_targeting_option SET child_interests = ?, "id" = ?, "level" = ?, "name" = ? WHERE 1=2;

--
-- DELETE template for table 'single_interest_targeting_option'
--
DELETE FROM single_interest_targeting_option WHERE 1=2;

