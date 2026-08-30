--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CatalogsHotelItemsBatch' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'catalogs_hotel_items_batch'
--
SELECT batch_id, catalog_type, completed_time, created_time, items, status FROM catalogs_hotel_items_batch WHERE 1=1;

--
-- INSERT template for table 'catalogs_hotel_items_batch'
--
INSERT INTO catalogs_hotel_items_batch (batch_id, catalog_type, completed_time, created_time, items, status) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'catalogs_hotel_items_batch'
--
UPDATE catalogs_hotel_items_batch SET batch_id = ?, catalog_type = ?, completed_time = ?, created_time = ?, items = ?, status = ? WHERE 1=2;

--
-- DELETE template for table 'catalogs_hotel_items_batch'
--
DELETE FROM catalogs_hotel_items_batch WHERE 1=2;

