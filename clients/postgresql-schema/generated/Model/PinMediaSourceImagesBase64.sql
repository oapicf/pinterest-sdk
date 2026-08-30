--
-- "Pinterest REST API"
-- Prepared SQL queries for 'PinMediaSourceImagesBase64' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'pin_media_source_images_base64'
--
SELECT "index", items, source_type FROM pin_media_source_images_base64 WHERE 1=1;

--
-- INSERT template for table 'pin_media_source_images_base64'
--
INSERT INTO pin_media_source_images_base64 ("index", items, source_type) VALUES (?, ?, ?);

--
-- UPDATE template for table 'pin_media_source_images_base64'
--
UPDATE pin_media_source_images_base64 SET "index" = ?, items = ?, source_type = ? WHERE 1=2;

--
-- DELETE template for table 'pin_media_source_images_base64'
--
DELETE FROM pin_media_source_images_base64 WHERE 1=2;

