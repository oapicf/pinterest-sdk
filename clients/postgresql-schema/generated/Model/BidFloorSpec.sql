--
-- "Pinterest REST API"
-- Prepared SQL queries for 'BidFloorSpec' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'bid_floor_spec'
--
SELECT billable_event, countries, creative_type, currency, objective_type, optimization_goal_metadata FROM bid_floor_spec WHERE 1=1;

--
-- INSERT template for table 'bid_floor_spec'
--
INSERT INTO bid_floor_spec (billable_event, countries, creative_type, currency, objective_type, optimization_goal_metadata) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'bid_floor_spec'
--
UPDATE bid_floor_spec SET billable_event = ?, countries = ?, creative_type = ?, currency = ?, objective_type = ?, optimization_goal_metadata = ? WHERE 1=2;

--
-- DELETE template for table 'bid_floor_spec'
--
DELETE FROM bid_floor_spec WHERE 1=2;

