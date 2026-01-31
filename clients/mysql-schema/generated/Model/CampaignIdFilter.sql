--
-- Pinterest REST API.
-- Prepared SQL queries for 'CampaignIdFilter' definition.
--


--
-- SELECT template for table `CampaignIdFilter`
--
SELECT `campaign_ids` FROM `CampaignIdFilter` WHERE 1;

--
-- INSERT template for table `CampaignIdFilter`
--
INSERT INTO `CampaignIdFilter`(`campaign_ids`) VALUES (?);

--
-- UPDATE template for table `CampaignIdFilter`
--
UPDATE `CampaignIdFilter` SET `campaign_ids` = ? WHERE 1;

--
-- DELETE template for table `CampaignIdFilter`
--
DELETE FROM `CampaignIdFilter` WHERE 0;

