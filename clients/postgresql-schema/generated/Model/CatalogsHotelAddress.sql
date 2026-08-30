--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CatalogsHotelAddress' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'catalogs_hotel_address'
--
SELECT addr1, city, country, postal_code, region FROM catalogs_hotel_address WHERE 1=1;

--
-- INSERT template for table 'catalogs_hotel_address'
--
INSERT INTO catalogs_hotel_address (addr1, city, country, postal_code, region) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table 'catalogs_hotel_address'
--
UPDATE catalogs_hotel_address SET addr1 = ?, city = ?, country = ?, postal_code = ?, region = ? WHERE 1=2;

--
-- DELETE template for table 'catalogs_hotel_address'
--
DELETE FROM catalogs_hotel_address WHERE 1=2;

