--
-- "Pinterest REST API"
-- Prepared SQL queries for 'AgeBucketMultipliers' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'age_bucket_multipliers'
--
SELECT age_bucket FROM age_bucket_multipliers WHERE 1=1;

--
-- INSERT template for table 'age_bucket_multipliers'
--
INSERT INTO age_bucket_multipliers (age_bucket) VALUES (?);

--
-- UPDATE template for table 'age_bucket_multipliers'
--
UPDATE age_bucket_multipliers SET age_bucket = ? WHERE 1=2;

--
-- DELETE template for table 'age_bucket_multipliers'
--
DELETE FROM age_bucket_multipliers WHERE 1=2;

