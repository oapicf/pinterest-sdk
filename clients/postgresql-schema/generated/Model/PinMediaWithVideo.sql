--
-- "Pinterest REST API"
-- Prepared SQL queries for 'PinMediaWithVideo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'pin_media_with_video'
--
SELECT cover_image_url, duration, height, images, media_type, video_url, video_url_hls, width FROM pin_media_with_video WHERE 1=1;

--
-- INSERT template for table 'pin_media_with_video'
--
INSERT INTO pin_media_with_video (cover_image_url, duration, height, images, media_type, video_url, video_url_hls, width) VALUES (?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'pin_media_with_video'
--
UPDATE pin_media_with_video SET cover_image_url = ?, duration = ?, height = ?, images = ?, media_type = ?, video_url = ?, video_url_hls = ?, width = ? WHERE 1=2;

--
-- DELETE template for table 'pin_media_with_video'
--
DELETE FROM pin_media_with_video WHERE 1=2;

