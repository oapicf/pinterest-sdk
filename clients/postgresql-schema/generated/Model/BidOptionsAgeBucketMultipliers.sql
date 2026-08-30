--
-- "Pinterest REST API"
-- Prepared SQL queries for 'BidOptionsAgeBucketMultipliers' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'bid_options_age_bucket_multipliers'
--
SELECT 18_24, 25_34, 35_44, 45_49, 50_54, 55_64, 65+ FROM bid_options_age_bucket_multipliers WHERE 1=1;

--
-- INSERT template for table 'bid_options_age_bucket_multipliers'
--
INSERT INTO bid_options_age_bucket_multipliers (18_24, 25_34, 35_44, 45_49, 50_54, 55_64, 65+) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'bid_options_age_bucket_multipliers'
--
UPDATE bid_options_age_bucket_multipliers SET 18_24 = ?, 25_34 = ?, 35_44 = ?, 45_49 = ?, 50_54 = ?, 55_64 = ?, 65+ = ? WHERE 1=2;

--
-- DELETE template for table 'bid_options_age_bucket_multipliers'
--
DELETE FROM bid_options_age_bucket_multipliers WHERE 1=2;

