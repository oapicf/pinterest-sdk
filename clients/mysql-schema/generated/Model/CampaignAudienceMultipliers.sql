--
-- Pinterest REST API.
-- Prepared SQL queries for 'CampaignAudienceMultipliers' definition.
--


--
-- SELECT template for table `CampaignAudienceMultipliers`
--
SELECT `AUDIENCE_ID` FROM `CampaignAudienceMultipliers` WHERE 1;

--
-- INSERT template for table `CampaignAudienceMultipliers`
--
INSERT INTO `CampaignAudienceMultipliers`(`AUDIENCE_ID`) VALUES (?);

--
-- UPDATE template for table `CampaignAudienceMultipliers`
--
UPDATE `CampaignAudienceMultipliers` SET `AUDIENCE_ID` = ? WHERE 1;

--
-- DELETE template for table `CampaignAudienceMultipliers`
--
DELETE FROM `CampaignAudienceMultipliers` WHERE 0;

