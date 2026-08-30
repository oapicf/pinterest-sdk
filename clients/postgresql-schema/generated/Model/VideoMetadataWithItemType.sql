--
-- "Pinterest REST API"
-- Prepared SQL queries for 'VideoMetadataWithItemType' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'video_metadata_with_item_type'
--
SELECT cover_image_url, duration, height, item_type, video_url, video_url_hls, width FROM video_metadata_with_item_type WHERE 1=1;

--
-- INSERT template for table 'video_metadata_with_item_type'
--
INSERT INTO video_metadata_with_item_type (cover_image_url, duration, height, item_type, video_url, video_url_hls, width) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'video_metadata_with_item_type'
--
UPDATE video_metadata_with_item_type SET cover_image_url = ?, duration = ?, height = ?, item_type = ?, video_url = ?, video_url_hls = ?, width = ? WHERE 1=2;

--
-- DELETE template for table 'video_metadata_with_item_type'
--
DELETE FROM video_metadata_with_item_type WHERE 1=2;

