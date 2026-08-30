--
-- "Pinterest REST API"
-- Prepared SQL queries for 'PinMediaSourceVideoID' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'pin_media_source_video_id'
--
SELECT cover_image_content_type, cover_image_data, cover_image_key_frame_time, cover_image_url, is_standard, media_id, source_type FROM pin_media_source_video_id WHERE 1=1;

--
-- INSERT template for table 'pin_media_source_video_id'
--
INSERT INTO pin_media_source_video_id (cover_image_content_type, cover_image_data, cover_image_key_frame_time, cover_image_url, is_standard, media_id, source_type) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'pin_media_source_video_id'
--
UPDATE pin_media_source_video_id SET cover_image_content_type = ?, cover_image_data = ?, cover_image_key_frame_time = ?, cover_image_url = ?, is_standard = ?, media_id = ?, source_type = ? WHERE 1=2;

--
-- DELETE template for table 'pin_media_source_video_id'
--
DELETE FROM pin_media_source_video_id WHERE 1=2;

