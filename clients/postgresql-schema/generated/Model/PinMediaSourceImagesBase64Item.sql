--
-- "Pinterest REST API"
-- Prepared SQL queries for 'PinMediaSourceImagesBase64Item' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'pin_media_source_images_base64_item'
--
SELECT content_type, "data", description, "link", title FROM pin_media_source_images_base64_item WHERE 1=1;

--
-- INSERT template for table 'pin_media_source_images_base64_item'
--
INSERT INTO pin_media_source_images_base64_item (content_type, "data", description, "link", title) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table 'pin_media_source_images_base64_item'
--
UPDATE pin_media_source_images_base64_item SET content_type = ?, "data" = ?, description = ?, "link" = ?, title = ? WHERE 1=2;

--
-- DELETE template for table 'pin_media_source_images_base64_item'
--
DELETE FROM pin_media_source_images_base64_item WHERE 1=2;

