--
-- "Pinterest REST API"
-- Prepared SQL queries for 'PinMedia' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'pin_media'
--
SELECT images, media_type, cover_image_url, duration, height, video_url, video_url_hls, width, items FROM pin_media WHERE 1=1;

--
-- INSERT template for table 'pin_media'
--
INSERT INTO pin_media (images, media_type, cover_image_url, duration, height, video_url, video_url_hls, width, items) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'pin_media'
--
UPDATE pin_media SET images = ?, media_type = ?, cover_image_url = ?, duration = ?, height = ?, video_url = ?, video_url_hls = ?, width = ?, items = ? WHERE 1=2;

--
-- DELETE template for table 'pin_media'
--
DELETE FROM pin_media WHERE 1=2;

