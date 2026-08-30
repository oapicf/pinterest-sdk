--
-- "Pinterest REST API"
-- Prepared SQL queries for 'PinMediaMetadata' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'pin_media_metadata'
--
SELECT description, images, item_type, "link", title, cover_image_url, duration, height, video_url, video_url_hls, width FROM pin_media_metadata WHERE 1=1;

--
-- INSERT template for table 'pin_media_metadata'
--
INSERT INTO pin_media_metadata (description, images, item_type, "link", title, cover_image_url, duration, height, video_url, video_url_hls, width) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'pin_media_metadata'
--
UPDATE pin_media_metadata SET description = ?, images = ?, item_type = ?, "link" = ?, title = ?, cover_image_url = ?, duration = ?, height = ?, video_url = ?, video_url_hls = ?, width = ? WHERE 1=2;

--
-- DELETE template for table 'pin_media_metadata'
--
DELETE FROM pin_media_metadata WHERE 1=2;

