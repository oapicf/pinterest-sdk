--
-- "Pinterest REST API"
-- Prepared SQL queries for 'BidOptionsAudienceMultipliers' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'bid_options_audience_multipliers'
--
SELECT audience_id, multiplier FROM bid_options_audience_multipliers WHERE 1=1;

--
-- INSERT template for table 'bid_options_audience_multipliers'
--
INSERT INTO bid_options_audience_multipliers (audience_id, multiplier) VALUES (?, ?);

--
-- UPDATE template for table 'bid_options_audience_multipliers'
--
UPDATE bid_options_audience_multipliers SET audience_id = ?, multiplier = ? WHERE 1=2;

--
-- DELETE template for table 'bid_options_audience_multipliers'
--
DELETE FROM bid_options_audience_multipliers WHERE 1=2;

