--
-- "Pinterest REST API"
-- Prepared SQL queries for 'PinMediaSourceImagesURL' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'pin_media_source_images_url'
--
SELECT "index", items, source_type FROM pin_media_source_images_url WHERE 1=1;

--
-- INSERT template for table 'pin_media_source_images_url'
--
INSERT INTO pin_media_source_images_url ("index", items, source_type) VALUES (?, ?, ?);

--
-- UPDATE template for table 'pin_media_source_images_url'
--
UPDATE pin_media_source_images_url SET "index" = ?, items = ?, source_type = ? WHERE 1=2;

--
-- DELETE template for table 'pin_media_source_images_url'
--
DELETE FROM pin_media_source_images_url WHERE 1=2;

