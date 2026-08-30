--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CatalogsCreativeAssetsAttributes' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'catalogs_creative_assets_attributes'
--
SELECT android_deep_link, custom_label_0, custom_label_1, custom_label_2, custom_label_3, custom_label_4, description, google_product_category, ios_deep_link, "link", title, visibility, ai_disclosures, image_link, video_link FROM catalogs_creative_assets_attributes WHERE 1=1;

--
-- INSERT template for table 'catalogs_creative_assets_attributes'
--
INSERT INTO catalogs_creative_assets_attributes (android_deep_link, custom_label_0, custom_label_1, custom_label_2, custom_label_3, custom_label_4, description, google_product_category, ios_deep_link, "link", title, visibility, ai_disclosures, image_link, video_link) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'catalogs_creative_assets_attributes'
--
UPDATE catalogs_creative_assets_attributes SET android_deep_link = ?, custom_label_0 = ?, custom_label_1 = ?, custom_label_2 = ?, custom_label_3 = ?, custom_label_4 = ?, description = ?, google_product_category = ?, ios_deep_link = ?, "link" = ?, title = ?, visibility = ?, ai_disclosures = ?, image_link = ?, video_link = ? WHERE 1=2;

--
-- DELETE template for table 'catalogs_creative_assets_attributes'
--
DELETE FROM catalogs_creative_assets_attributes WHERE 1=2;

