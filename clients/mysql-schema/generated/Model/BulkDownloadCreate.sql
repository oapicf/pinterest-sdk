--
-- Pinterest REST API.
-- Prepared SQL queries for 'BulkDownloadCreate' definition.
--


--
-- SELECT template for table `BulkDownloadCreate`
--
SELECT `campaign_filter`, `entity_ids`, `entity_types`, `output_format`, `updated_since` FROM `BulkDownloadCreate` WHERE 1;

--
-- INSERT template for table `BulkDownloadCreate`
--
INSERT INTO `BulkDownloadCreate`(`campaign_filter`, `entity_ids`, `entity_types`, `output_format`, `updated_since`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `BulkDownloadCreate`
--
UPDATE `BulkDownloadCreate` SET `campaign_filter` = ?, `entity_ids` = ?, `entity_types` = ?, `output_format` = ?, `updated_since` = ? WHERE 1;

--
-- DELETE template for table `BulkDownloadCreate`
--
DELETE FROM `BulkDownloadCreate` WHERE 0;

