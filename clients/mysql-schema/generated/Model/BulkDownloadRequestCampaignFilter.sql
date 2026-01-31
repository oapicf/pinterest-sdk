--
-- Pinterest REST API.
-- Prepared SQL queries for 'BulkDownloadRequest_campaign_filter' definition.
--


--
-- SELECT template for table `BulkDownloadRequest_campaign_filter`
--
SELECT `campaign_status`, `end_time`, `name`, `objective_type`, `start_time` FROM `BulkDownloadRequest_campaign_filter` WHERE 1;

--
-- INSERT template for table `BulkDownloadRequest_campaign_filter`
--
INSERT INTO `BulkDownloadRequest_campaign_filter`(`campaign_status`, `end_time`, `name`, `objective_type`, `start_time`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `BulkDownloadRequest_campaign_filter`
--
UPDATE `BulkDownloadRequest_campaign_filter` SET `campaign_status` = ?, `end_time` = ?, `name` = ?, `objective_type` = ?, `start_time` = ? WHERE 1;

--
-- DELETE template for table `BulkDownloadRequest_campaign_filter`
--
DELETE FROM `BulkDownloadRequest_campaign_filter` WHERE 0;

