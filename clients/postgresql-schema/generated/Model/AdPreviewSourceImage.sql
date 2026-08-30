--
-- "Pinterest REST API"
-- Prepared SQL queries for 'AdPreviewSourceImage' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'ad_preview_source_image'
--
SELECT image_url, promotion_id, title FROM ad_preview_source_image WHERE 1=1;

--
-- INSERT template for table 'ad_preview_source_image'
--
INSERT INTO ad_preview_source_image (image_url, promotion_id, title) VALUES (?, ?, ?);

--
-- UPDATE template for table 'ad_preview_source_image'
--
UPDATE ad_preview_source_image SET image_url = ?, promotion_id = ?, title = ? WHERE 1=2;

--
-- DELETE template for table 'ad_preview_source_image'
--
DELETE FROM ad_preview_source_image WHERE 1=2;

