--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CatalogsCreativeAssetsProductGroupFilterKeys' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'catalogs_creative_assets_product_group_filter_keys'
--
SELECT creative_assets_id, custom_label_0, custom_label_1, custom_label_2, custom_label_3, custom_label_4, google_product_category_6, google_product_category_5, google_product_category_4, google_product_category_3, google_product_category_2, google_product_category_1, google_product_category_0, media_type, title_keywords, "link" FROM catalogs_creative_assets_product_group_filter_keys WHERE 1=1;

--
-- INSERT template for table 'catalogs_creative_assets_product_group_filter_keys'
--
INSERT INTO catalogs_creative_assets_product_group_filter_keys (creative_assets_id, custom_label_0, custom_label_1, custom_label_2, custom_label_3, custom_label_4, google_product_category_6, google_product_category_5, google_product_category_4, google_product_category_3, google_product_category_2, google_product_category_1, google_product_category_0, media_type, title_keywords, "link") VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'catalogs_creative_assets_product_group_filter_keys'
--
UPDATE catalogs_creative_assets_product_group_filter_keys SET creative_assets_id = ?, custom_label_0 = ?, custom_label_1 = ?, custom_label_2 = ?, custom_label_3 = ?, custom_label_4 = ?, google_product_category_6 = ?, google_product_category_5 = ?, google_product_category_4 = ?, google_product_category_3 = ?, google_product_category_2 = ?, google_product_category_1 = ?, google_product_category_0 = ?, media_type = ?, title_keywords = ?, "link" = ? WHERE 1=2;

--
-- DELETE template for table 'catalogs_creative_assets_product_group_filter_keys'
--
DELETE FROM catalogs_creative_assets_product_group_filter_keys WHERE 1=2;

