--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CatalogsHotelAttributes' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'catalogs_hotel_attributes'
--
SELECT address, base_price, brand, category, custom_label_0, custom_label_1, custom_label_2, custom_label_3, custom_label_4, description, guest_ratings, latitude, "link", longitude, "name", neighborhood, sale_price, additional_image_link, ai_disclosures, main_image FROM catalogs_hotel_attributes WHERE 1=1;

--
-- INSERT template for table 'catalogs_hotel_attributes'
--
INSERT INTO catalogs_hotel_attributes (address, base_price, brand, category, custom_label_0, custom_label_1, custom_label_2, custom_label_3, custom_label_4, description, guest_ratings, latitude, "link", longitude, "name", neighborhood, sale_price, additional_image_link, ai_disclosures, main_image) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'catalogs_hotel_attributes'
--
UPDATE catalogs_hotel_attributes SET address = ?, base_price = ?, brand = ?, category = ?, custom_label_0 = ?, custom_label_1 = ?, custom_label_2 = ?, custom_label_3 = ?, custom_label_4 = ?, description = ?, guest_ratings = ?, latitude = ?, "link" = ?, longitude = ?, "name" = ?, neighborhood = ?, sale_price = ?, additional_image_link = ?, ai_disclosures = ?, main_image = ? WHERE 1=2;

--
-- DELETE template for table 'catalogs_hotel_attributes'
--
DELETE FROM catalogs_hotel_attributes WHERE 1=2;

