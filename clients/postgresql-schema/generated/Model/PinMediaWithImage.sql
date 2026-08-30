--
-- "Pinterest REST API"
-- Prepared SQL queries for 'PinMediaWithImage' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'pin_media_with_image'
--
SELECT images, media_type FROM pin_media_with_image WHERE 1=1;

--
-- INSERT template for table 'pin_media_with_image'
--
INSERT INTO pin_media_with_image (images, media_type) VALUES (?, ?);

--
-- UPDATE template for table 'pin_media_with_image'
--
UPDATE pin_media_with_image SET images = ?, media_type = ? WHERE 1=2;

--
-- DELETE template for table 'pin_media_with_image'
--
DELETE FROM pin_media_with_image WHERE 1=2;

