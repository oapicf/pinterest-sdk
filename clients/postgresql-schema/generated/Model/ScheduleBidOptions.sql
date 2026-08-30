--
-- "Pinterest REST API"
-- Prepared SQL queries for 'ScheduleBidOptions' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'schedule_bid_options'
--
SELECT age_bucket_multipliers, app_type_multipliers, audience_multipliers, gender_multipliers, placement_multipliers FROM schedule_bid_options WHERE 1=1;

--
-- INSERT template for table 'schedule_bid_options'
--
INSERT INTO schedule_bid_options (age_bucket_multipliers, app_type_multipliers, audience_multipliers, gender_multipliers, placement_multipliers) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table 'schedule_bid_options'
--
UPDATE schedule_bid_options SET age_bucket_multipliers = ?, app_type_multipliers = ?, audience_multipliers = ?, gender_multipliers = ?, placement_multipliers = ? WHERE 1=2;

--
-- DELETE template for table 'schedule_bid_options'
--
DELETE FROM schedule_bid_options WHERE 1=2;

