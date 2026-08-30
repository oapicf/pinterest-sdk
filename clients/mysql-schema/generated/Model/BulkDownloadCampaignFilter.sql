--
-- Pinterest REST API.
-- Prepared SQL queries for 'BulkDownloadCampaignFilter' definition.
--


--
-- SELECT template for table `BulkDownloadCampaignFilter`
--
SELECT `campaign_status`, `end_time`, `name`, `objective_type`, `start_time` FROM `BulkDownloadCampaignFilter` WHERE 1;

--
-- INSERT template for table `BulkDownloadCampaignFilter`
--
INSERT INTO `BulkDownloadCampaignFilter`(`campaign_status`, `end_time`, `name`, `objective_type`, `start_time`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `BulkDownloadCampaignFilter`
--
UPDATE `BulkDownloadCampaignFilter` SET `campaign_status` = ?, `end_time` = ?, `name` = ?, `objective_type` = ?, `start_time` = ? WHERE 1;

--
-- DELETE template for table `BulkDownloadCampaignFilter`
--
DELETE FROM `BulkDownloadCampaignFilter` WHERE 0;

