--
-- Pinterest REST API.
-- Prepared SQL queries for 'BulkDownloadRequest_campaign_filter' definition.
--


--
-- SELECT template for table `BulkDownloadRequest_campaign_filter`
--
SELECT `start_time`, `end_time`, `name`, `campaign_status`, `objective_type` FROM `BulkDownloadRequest_campaign_filter` WHERE 1;

--
-- INSERT template for table `BulkDownloadRequest_campaign_filter`
--
INSERT INTO `BulkDownloadRequest_campaign_filter`(`start_time`, `end_time`, `name`, `campaign_status`, `objective_type`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `BulkDownloadRequest_campaign_filter`
--
UPDATE `BulkDownloadRequest_campaign_filter` SET `start_time` = ?, `end_time` = ?, `name` = ?, `campaign_status` = ?, `objective_type` = ? WHERE 1;

--
-- DELETE template for table `BulkDownloadRequest_campaign_filter`
--
DELETE FROM `BulkDownloadRequest_campaign_filter` WHERE 0;

