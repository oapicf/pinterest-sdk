--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CatalogsFeedVideoCounts' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'catalogs_feed_video_counts'
--
SELECT ingested_videos, not_ingested_videos, total_videos FROM catalogs_feed_video_counts WHERE 1=1;

--
-- INSERT template for table 'catalogs_feed_video_counts'
--
INSERT INTO catalogs_feed_video_counts (ingested_videos, not_ingested_videos, total_videos) VALUES (?, ?, ?);

--
-- UPDATE template for table 'catalogs_feed_video_counts'
--
UPDATE catalogs_feed_video_counts SET ingested_videos = ?, not_ingested_videos = ?, total_videos = ? WHERE 1=2;

--
-- DELETE template for table 'catalogs_feed_video_counts'
--
DELETE FROM catalogs_feed_video_counts WHERE 1=2;

