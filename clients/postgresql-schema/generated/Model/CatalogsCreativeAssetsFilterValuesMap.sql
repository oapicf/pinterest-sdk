--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CatalogsCreativeAssetsFilterValuesMap' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'catalogs_creative_assets_filter_values_map'
--
SELECT custom_label_0, custom_label_1, custom_label_2, custom_label_3, custom_label_4, google_product_category_0, google_product_category_1, google_product_category_2, google_product_category_3, google_product_category_4, google_product_category_5, google_product_category_6, media_type FROM catalogs_creative_assets_filter_values_map WHERE 1=1;

--
-- INSERT template for table 'catalogs_creative_assets_filter_values_map'
--
INSERT INTO catalogs_creative_assets_filter_values_map (custom_label_0, custom_label_1, custom_label_2, custom_label_3, custom_label_4, google_product_category_0, google_product_category_1, google_product_category_2, google_product_category_3, google_product_category_4, google_product_category_5, google_product_category_6, media_type) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'catalogs_creative_assets_filter_values_map'
--
UPDATE catalogs_creative_assets_filter_values_map SET custom_label_0 = ?, custom_label_1 = ?, custom_label_2 = ?, custom_label_3 = ?, custom_label_4 = ?, google_product_category_0 = ?, google_product_category_1 = ?, google_product_category_2 = ?, google_product_category_3 = ?, google_product_category_4 = ?, google_product_category_5 = ?, google_product_category_6 = ?, media_type = ? WHERE 1=2;

--
-- DELETE template for table 'catalogs_creative_assets_filter_values_map'
--
DELETE FROM catalogs_creative_assets_filter_values_map WHERE 1=2;

