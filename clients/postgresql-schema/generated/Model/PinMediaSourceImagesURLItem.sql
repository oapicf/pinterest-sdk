--
-- "Pinterest REST API"
-- Prepared SQL queries for 'PinMediaSourceImagesURLItem' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'pin_media_source_images_url_item'
--
SELECT description, "link", title, url FROM pin_media_source_images_url_item WHERE 1=1;

--
-- INSERT template for table 'pin_media_source_images_url_item'
--
INSERT INTO pin_media_source_images_url_item (description, "link", title, url) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'pin_media_source_images_url_item'
--
UPDATE pin_media_source_images_url_item SET description = ?, "link" = ?, title = ?, url = ? WHERE 1=2;

--
-- DELETE template for table 'pin_media_source_images_url_item'
--
DELETE FROM pin_media_source_images_url_item WHERE 1=2;

