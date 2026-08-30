--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CatalogsProductGroupFilterKeys' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'catalogs_product_group_filter_keys'
--
SELECT min_price, max_price, currency, item_id, availability, brand, "condition", custom_label_0, custom_label_1, custom_label_2, custom_label_3, custom_label_4, item_group_id, gender, media_type, product_type_4, product_type_3, product_type_2, product_type_1, product_type_0, google_product_category_6, google_product_category_5, google_product_category_4, google_product_category_3, google_product_category_2, google_product_category_1, google_product_category_0, custom_number_0, custom_number_1, custom_number_2, custom_number_3, custom_number_4, title_keywords, pinterest_product_categories, product_group FROM catalogs_product_group_filter_keys WHERE 1=1;

--
-- INSERT template for table 'catalogs_product_group_filter_keys'
--
INSERT INTO catalogs_product_group_filter_keys (min_price, max_price, currency, item_id, availability, brand, "condition", custom_label_0, custom_label_1, custom_label_2, custom_label_3, custom_label_4, item_group_id, gender, media_type, product_type_4, product_type_3, product_type_2, product_type_1, product_type_0, google_product_category_6, google_product_category_5, google_product_category_4, google_product_category_3, google_product_category_2, google_product_category_1, google_product_category_0, custom_number_0, custom_number_1, custom_number_2, custom_number_3, custom_number_4, title_keywords, pinterest_product_categories, product_group) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'catalogs_product_group_filter_keys'
--
UPDATE catalogs_product_group_filter_keys SET min_price = ?, max_price = ?, currency = ?, item_id = ?, availability = ?, brand = ?, "condition" = ?, custom_label_0 = ?, custom_label_1 = ?, custom_label_2 = ?, custom_label_3 = ?, custom_label_4 = ?, item_group_id = ?, gender = ?, media_type = ?, product_type_4 = ?, product_type_3 = ?, product_type_2 = ?, product_type_1 = ?, product_type_0 = ?, google_product_category_6 = ?, google_product_category_5 = ?, google_product_category_4 = ?, google_product_category_3 = ?, google_product_category_2 = ?, google_product_category_1 = ?, google_product_category_0 = ?, custom_number_0 = ?, custom_number_1 = ?, custom_number_2 = ?, custom_number_3 = ?, custom_number_4 = ?, title_keywords = ?, pinterest_product_categories = ?, product_group = ? WHERE 1=2;

--
-- DELETE template for table 'catalogs_product_group_filter_keys'
--
DELETE FROM catalogs_product_group_filter_keys WHERE 1=2;

