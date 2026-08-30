--
-- "Pinterest REST API"
-- Prepared SQL queries for 'PinMediaWithImages' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'pin_media_with_images'
--
SELECT items, media_type FROM pin_media_with_images WHERE 1=1;

--
-- INSERT template for table 'pin_media_with_images'
--
INSERT INTO pin_media_with_images (items, media_type) VALUES (?, ?);

--
-- UPDATE template for table 'pin_media_with_images'
--
UPDATE pin_media_with_images SET items = ?, media_type = ? WHERE 1=2;

--
-- DELETE template for table 'pin_media_with_images'
--
DELETE FROM pin_media_with_images WHERE 1=2;

