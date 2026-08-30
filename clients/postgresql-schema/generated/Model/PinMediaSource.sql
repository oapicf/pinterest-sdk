--
-- "Pinterest REST API"
-- Prepared SQL queries for 'PinMediaSource' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'pin_media_source'
--
SELECT content_type, "data", is_standard, source_type, url, cover_image_content_type, cover_image_data, cover_image_key_frame_time, cover_image_url, media_id, "index", items, is_affiliate_link FROM pin_media_source WHERE 1=1;

--
-- INSERT template for table 'pin_media_source'
--
INSERT INTO pin_media_source (content_type, "data", is_standard, source_type, url, cover_image_content_type, cover_image_data, cover_image_key_frame_time, cover_image_url, media_id, "index", items, is_affiliate_link) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'pin_media_source'
--
UPDATE pin_media_source SET content_type = ?, "data" = ?, is_standard = ?, source_type = ?, url = ?, cover_image_content_type = ?, cover_image_data = ?, cover_image_key_frame_time = ?, cover_image_url = ?, media_id = ?, "index" = ?, items = ?, is_affiliate_link = ? WHERE 1=2;

--
-- DELETE template for table 'pin_media_source'
--
DELETE FROM pin_media_source WHERE 1=2;

