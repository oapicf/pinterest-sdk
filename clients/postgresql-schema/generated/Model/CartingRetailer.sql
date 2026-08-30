--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CartingRetailer' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'carting_retailer'
--
SELECT retailer_id, retailer_name FROM carting_retailer WHERE 1=1;

--
-- INSERT template for table 'carting_retailer'
--
INSERT INTO carting_retailer (retailer_id, retailer_name) VALUES (?, ?);

--
-- UPDATE template for table 'carting_retailer'
--
UPDATE carting_retailer SET retailer_id = ?, retailer_name = ? WHERE 1=2;

--
-- DELETE template for table 'carting_retailer'
--
DELETE FROM carting_retailer WHERE 1=2;

