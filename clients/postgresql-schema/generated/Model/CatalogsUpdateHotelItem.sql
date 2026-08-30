--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CatalogsUpdateHotelItem' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'catalogs_update_hotel_item'
--
SELECT "attributes", hotel_id, operation FROM catalogs_update_hotel_item WHERE 1=1;

--
-- INSERT template for table 'catalogs_update_hotel_item'
--
INSERT INTO catalogs_update_hotel_item ("attributes", hotel_id, operation) VALUES (?, ?, ?);

--
-- UPDATE template for table 'catalogs_update_hotel_item'
--
UPDATE catalogs_update_hotel_item SET "attributes" = ?, hotel_id = ?, operation = ? WHERE 1=2;

--
-- DELETE template for table 'catalogs_update_hotel_item'
--
DELETE FROM catalogs_update_hotel_item WHERE 1=2;

