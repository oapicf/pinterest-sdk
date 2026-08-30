--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CatalogsHotelBatchItem' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'catalogs_hotel_batch_item'
--
SELECT "attributes", hotel_id, operation FROM catalogs_hotel_batch_item WHERE 1=1;

--
-- INSERT template for table 'catalogs_hotel_batch_item'
--
INSERT INTO catalogs_hotel_batch_item ("attributes", hotel_id, operation) VALUES (?, ?, ?);

--
-- UPDATE template for table 'catalogs_hotel_batch_item'
--
UPDATE catalogs_hotel_batch_item SET "attributes" = ?, hotel_id = ?, operation = ? WHERE 1=2;

--
-- DELETE template for table 'catalogs_hotel_batch_item'
--
DELETE FROM catalogs_hotel_batch_item WHERE 1=2;

