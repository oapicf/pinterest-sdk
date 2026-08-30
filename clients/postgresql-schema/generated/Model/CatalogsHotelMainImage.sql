--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CatalogsHotelMainImage' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'catalogs_hotel_main_image'
--
SELECT "link", tag FROM catalogs_hotel_main_image WHERE 1=1;

--
-- INSERT template for table 'catalogs_hotel_main_image'
--
INSERT INTO catalogs_hotel_main_image ("link", tag) VALUES (?, ?);

--
-- UPDATE template for table 'catalogs_hotel_main_image'
--
UPDATE catalogs_hotel_main_image SET "link" = ?, tag = ? WHERE 1=2;

--
-- DELETE template for table 'catalogs_hotel_main_image'
--
DELETE FROM catalogs_hotel_main_image WHERE 1=2;

