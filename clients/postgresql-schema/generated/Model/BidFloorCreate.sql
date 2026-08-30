--
-- "Pinterest REST API"
-- Prepared SQL queries for 'BidFloorCreate' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'bid_floor_create'
--
SELECT bid_floor_specs, targeting_spec FROM bid_floor_create WHERE 1=1;

--
-- INSERT template for table 'bid_floor_create'
--
INSERT INTO bid_floor_create (bid_floor_specs, targeting_spec) VALUES (?, ?);

--
-- UPDATE template for table 'bid_floor_create'
--
UPDATE bid_floor_create SET bid_floor_specs = ?, targeting_spec = ? WHERE 1=2;

--
-- DELETE template for table 'bid_floor_create'
--
DELETE FROM bid_floor_create WHERE 1=2;

