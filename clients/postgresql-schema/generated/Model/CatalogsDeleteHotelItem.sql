--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CatalogsDeleteHotelItem' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'catalogs_delete_hotel_item'
--
SELECT hotel_id, operation FROM catalogs_delete_hotel_item WHERE 1=1;

--
-- INSERT template for table 'catalogs_delete_hotel_item'
--
INSERT INTO catalogs_delete_hotel_item (hotel_id, operation) VALUES (?, ?);

--
-- UPDATE template for table 'catalogs_delete_hotel_item'
--
UPDATE catalogs_delete_hotel_item SET hotel_id = ?, operation = ? WHERE 1=2;

--
-- DELETE template for table 'catalogs_delete_hotel_item'
--
DELETE FROM catalogs_delete_hotel_item WHERE 1=2;

