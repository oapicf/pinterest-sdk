--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CatalogsRetailFilterValuesMap' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'catalogs_retail_filter_values_map'
--
SELECT ad_image_tags, ad_video_tags, availability, brand, "condition", custom_label_0, custom_label_1, custom_label_2, custom_label_3, custom_label_4, gender, google_product_category_0, google_product_category_1, google_product_category_2, google_product_category_3, google_product_category_4, google_product_category_5, google_product_category_6, media_type, product_type_0, product_type_1, product_type_2, product_type_3, product_type_4 FROM catalogs_retail_filter_values_map WHERE 1=1;

--
-- INSERT template for table 'catalogs_retail_filter_values_map'
--
INSERT INTO catalogs_retail_filter_values_map (ad_image_tags, ad_video_tags, availability, brand, "condition", custom_label_0, custom_label_1, custom_label_2, custom_label_3, custom_label_4, gender, google_product_category_0, google_product_category_1, google_product_category_2, google_product_category_3, google_product_category_4, google_product_category_5, google_product_category_6, media_type, product_type_0, product_type_1, product_type_2, product_type_3, product_type_4) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'catalogs_retail_filter_values_map'
--
UPDATE catalogs_retail_filter_values_map SET ad_image_tags = ?, ad_video_tags = ?, availability = ?, brand = ?, "condition" = ?, custom_label_0 = ?, custom_label_1 = ?, custom_label_2 = ?, custom_label_3 = ?, custom_label_4 = ?, gender = ?, google_product_category_0 = ?, google_product_category_1 = ?, google_product_category_2 = ?, google_product_category_3 = ?, google_product_category_4 = ?, google_product_category_5 = ?, google_product_category_6 = ?, media_type = ?, product_type_0 = ?, product_type_1 = ?, product_type_2 = ?, product_type_3 = ?, product_type_4 = ? WHERE 1=2;

--
-- DELETE template for table 'catalogs_retail_filter_values_map'
--
DELETE FROM catalogs_retail_filter_values_map WHERE 1=2;

