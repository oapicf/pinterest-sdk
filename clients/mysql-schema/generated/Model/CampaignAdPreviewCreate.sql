--
-- Pinterest REST API.
-- Prepared SQL queries for 'CampaignAdPreviewCreate' definition.
--


--
-- SELECT template for table `CampaignAdPreviewCreate`
--
SELECT `ad_group_id` FROM `CampaignAdPreviewCreate` WHERE 1;

--
-- INSERT template for table `CampaignAdPreviewCreate`
--
INSERT INTO `CampaignAdPreviewCreate`(`ad_group_id`) VALUES (?);

--
-- UPDATE template for table `CampaignAdPreviewCreate`
--
UPDATE `CampaignAdPreviewCreate` SET `ad_group_id` = ? WHERE 1;

--
-- DELETE template for table `CampaignAdPreviewCreate`
--
DELETE FROM `CampaignAdPreviewCreate` WHERE 0;

