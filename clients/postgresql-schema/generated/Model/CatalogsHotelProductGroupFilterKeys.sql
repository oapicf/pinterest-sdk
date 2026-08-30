--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CatalogsHotelProductGroupFilterKeys' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'catalogs_hotel_product_group_filter_keys'
--
SELECT price, hotel_id, brand, custom_label_0, custom_label_1, custom_label_2, custom_label_3, custom_label_4, country, title_keywords FROM catalogs_hotel_product_group_filter_keys WHERE 1=1;

--
-- INSERT template for table 'catalogs_hotel_product_group_filter_keys'
--
INSERT INTO catalogs_hotel_product_group_filter_keys (price, hotel_id, brand, custom_label_0, custom_label_1, custom_label_2, custom_label_3, custom_label_4, country, title_keywords) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'catalogs_hotel_product_group_filter_keys'
--
UPDATE catalogs_hotel_product_group_filter_keys SET price = ?, hotel_id = ?, brand = ?, custom_label_0 = ?, custom_label_1 = ?, custom_label_2 = ?, custom_label_3 = ?, custom_label_4 = ?, country = ?, title_keywords = ? WHERE 1=2;

--
-- DELETE template for table 'catalogs_hotel_product_group_filter_keys'
--
DELETE FROM catalogs_hotel_product_group_filter_keys WHERE 1=2;

