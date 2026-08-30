--
-- "Pinterest REST API"
-- Prepared SQL queries for 'PinMediaSourceImageURL' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'pin_media_source_image_url'
--
SELECT is_standard, source_type, url FROM pin_media_source_image_url WHERE 1=1;

--
-- INSERT template for table 'pin_media_source_image_url'
--
INSERT INTO pin_media_source_image_url (is_standard, source_type, url) VALUES (?, ?, ?);

--
-- UPDATE template for table 'pin_media_source_image_url'
--
UPDATE pin_media_source_image_url SET is_standard = ?, source_type = ?, url = ? WHERE 1=2;

--
-- DELETE template for table 'pin_media_source_image_url'
--
DELETE FROM pin_media_source_image_url WHERE 1=2;

