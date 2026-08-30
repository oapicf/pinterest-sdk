--
-- Pinterest REST API.
-- Prepared SQL queries for 'CampaignPlanningResponseError' definition.
--


--
-- SELECT template for table `CampaignPlanningResponseError`
--
SELECT `code`, `message` FROM `CampaignPlanningResponseError` WHERE 1;

--
-- INSERT template for table `CampaignPlanningResponseError`
--
INSERT INTO `CampaignPlanningResponseError`(`code`, `message`) VALUES (?, ?);

--
-- UPDATE template for table `CampaignPlanningResponseError`
--
UPDATE `CampaignPlanningResponseError` SET `code` = ?, `message` = ? WHERE 1;

--
-- DELETE template for table `CampaignPlanningResponseError`
--
DELETE FROM `CampaignPlanningResponseError` WHERE 0;

