--
-- "Pinterest REST API"
-- Prepared SQL queries for 'HotelIdFilter' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'hotel_id_filter'
--
SELECT hotel_id FROM hotel_id_filter WHERE 1=1;

--
-- INSERT template for table 'hotel_id_filter'
--
INSERT INTO hotel_id_filter (hotel_id) VALUES (?);

--
-- UPDATE template for table 'hotel_id_filter'
--
UPDATE hotel_id_filter SET hotel_id = ? WHERE 1=2;

--
-- DELETE template for table 'hotel_id_filter'
--
DELETE FROM hotel_id_filter WHERE 1=2;

