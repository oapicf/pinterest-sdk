--
-- "Pinterest REST API"
-- Prepared SQL queries for 'ScheduleBidMultipliers' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'schedule_bid_multipliers'
--
SELECT age_bucket_multipliers, app_type_multipliers, audience_multipliers, gender_multipliers, placement_multipliers FROM schedule_bid_multipliers WHERE 1=1;

--
-- INSERT template for table 'schedule_bid_multipliers'
--
INSERT INTO schedule_bid_multipliers (age_bucket_multipliers, app_type_multipliers, audience_multipliers, gender_multipliers, placement_multipliers) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table 'schedule_bid_multipliers'
--
UPDATE schedule_bid_multipliers SET age_bucket_multipliers = ?, app_type_multipliers = ?, audience_multipliers = ?, gender_multipliers = ?, placement_multipliers = ? WHERE 1=2;

--
-- DELETE template for table 'schedule_bid_multipliers'
--
DELETE FROM schedule_bid_multipliers WHERE 1=2;

