--
-- "Pinterest REST API"
-- Prepared SQL queries for 'PinMediaWithImageAndVideo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'pin_media_with_image_and_video'
--
SELECT items, media_type FROM pin_media_with_image_and_video WHERE 1=1;

--
-- INSERT template for table 'pin_media_with_image_and_video'
--
INSERT INTO pin_media_with_image_and_video (items, media_type) VALUES (?, ?);

--
-- UPDATE template for table 'pin_media_with_image_and_video'
--
UPDATE pin_media_with_image_and_video SET items = ?, media_type = ? WHERE 1=2;

--
-- DELETE template for table 'pin_media_with_image_and_video'
--
DELETE FROM pin_media_with_image_and_video WHERE 1=2;

