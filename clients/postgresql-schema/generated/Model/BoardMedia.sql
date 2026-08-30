--
-- "Pinterest REST API"
-- Prepared SQL queries for 'BoardMedia' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'board_media'
--
SELECT image_cover_url, pin_thumbnail_urls FROM board_media WHERE 1=1;

--
-- INSERT template for table 'board_media'
--
INSERT INTO board_media (image_cover_url, pin_thumbnail_urls) VALUES (?, ?);

--
-- UPDATE template for table 'board_media'
--
UPDATE board_media SET image_cover_url = ?, pin_thumbnail_urls = ? WHERE 1=2;

--
-- DELETE template for table 'board_media'
--
DELETE FROM board_media WHERE 1=2;

