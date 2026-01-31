--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsFeedVideoCounts' definition.
--


--
-- SELECT template for table `CatalogsFeedVideoCounts`
--
SELECT `ingested_videos`, `not_ingested_videos`, `total_videos` FROM `CatalogsFeedVideoCounts` WHERE 1;

--
-- INSERT template for table `CatalogsFeedVideoCounts`
--
INSERT INTO `CatalogsFeedVideoCounts`(`ingested_videos`, `not_ingested_videos`, `total_videos`) VALUES (?, ?, ?);

--
-- UPDATE template for table `CatalogsFeedVideoCounts`
--
UPDATE `CatalogsFeedVideoCounts` SET `ingested_videos` = ?, `not_ingested_videos` = ?, `total_videos` = ? WHERE 1;

--
-- DELETE template for table `CatalogsFeedVideoCounts`
--
DELETE FROM `CatalogsFeedVideoCounts` WHERE 0;

