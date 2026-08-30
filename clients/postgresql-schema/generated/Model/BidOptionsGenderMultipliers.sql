--
-- "Pinterest REST API"
-- Prepared SQL queries for 'BidOptionsGenderMultipliers' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'bid_options_gender_multipliers'
--
SELECT female, male FROM bid_options_gender_multipliers WHERE 1=1;

--
-- INSERT template for table 'bid_options_gender_multipliers'
--
INSERT INTO bid_options_gender_multipliers (female, male) VALUES (?, ?);

--
-- UPDATE template for table 'bid_options_gender_multipliers'
--
UPDATE bid_options_gender_multipliers SET female = ?, male = ? WHERE 1=2;

--
-- DELETE template for table 'bid_options_gender_multipliers'
--
DELETE FROM bid_options_gender_multipliers WHERE 1=2;

