--
-- "Pinterest REST API"
-- Prepared SQL queries for 'PinMediaWithVideos' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'pin_media_with_videos'
--
SELECT items, media_type FROM pin_media_with_videos WHERE 1=1;

--
-- INSERT template for table 'pin_media_with_videos'
--
INSERT INTO pin_media_with_videos (items, media_type) VALUES (?, ?);

--
-- UPDATE template for table 'pin_media_with_videos'
--
UPDATE pin_media_with_videos SET items = ?, media_type = ? WHERE 1=2;

--
-- DELETE template for table 'pin_media_with_videos'
--
DELETE FROM pin_media_with_videos WHERE 1=2;

