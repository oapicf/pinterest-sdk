--
-- "Pinterest REST API"
-- Prepared SQL queries for 'BidFloor' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'bid_floor'
--
SELECT bid_floors, "type" FROM bid_floor WHERE 1=1;

--
-- INSERT template for table 'bid_floor'
--
INSERT INTO bid_floor (bid_floors, "type") VALUES (?, ?);

--
-- UPDATE template for table 'bid_floor'
--
UPDATE bid_floor SET bid_floors = ?, "type" = ? WHERE 1=2;

--
-- DELETE template for table 'bid_floor'
--
DELETE FROM bid_floor WHERE 1=2;

