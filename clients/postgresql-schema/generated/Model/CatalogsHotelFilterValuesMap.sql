--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CatalogsHotelFilterValuesMap' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'catalogs_hotel_filter_values_map'
--
SELECT brand, custom_label_0, custom_label_1, custom_label_2, custom_label_3, custom_label_4 FROM catalogs_hotel_filter_values_map WHERE 1=1;

--
-- INSERT template for table 'catalogs_hotel_filter_values_map'
--
INSERT INTO catalogs_hotel_filter_values_map (brand, custom_label_0, custom_label_1, custom_label_2, custom_label_3, custom_label_4) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'catalogs_hotel_filter_values_map'
--
UPDATE catalogs_hotel_filter_values_map SET brand = ?, custom_label_0 = ?, custom_label_1 = ?, custom_label_2 = ?, custom_label_3 = ?, custom_label_4 = ? WHERE 1=2;

--
-- DELETE template for table 'catalogs_hotel_filter_values_map'
--
DELETE FROM catalogs_hotel_filter_values_map WHERE 1=2;

