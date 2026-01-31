--
-- Pinterest REST API.
-- Prepared SQL queries for 'CampaignObjectivesFilter' definition.
--


--
-- SELECT template for table `CampaignObjectivesFilter`
--
SELECT `campaign_objective_types` FROM `CampaignObjectivesFilter` WHERE 1;

--
-- INSERT template for table `CampaignObjectivesFilter`
--
INSERT INTO `CampaignObjectivesFilter`(`campaign_objective_types`) VALUES (?);

--
-- UPDATE template for table `CampaignObjectivesFilter`
--
UPDATE `CampaignObjectivesFilter` SET `campaign_objective_types` = ? WHERE 1;

--
-- DELETE template for table `CampaignObjectivesFilter`
--
DELETE FROM `CampaignObjectivesFilter` WHERE 0;

