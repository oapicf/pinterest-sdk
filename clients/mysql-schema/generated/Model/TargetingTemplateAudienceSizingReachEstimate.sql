--
-- Pinterest REST API.
-- Prepared SQL queries for 'TargetingTemplateAudienceSizing_reach_estimate' definition.
--


--
-- SELECT template for table `TargetingTemplateAudienceSizing_reach_estimate`
--
SELECT `estimate`, `lower_bound`, `upper_bound` FROM `TargetingTemplateAudienceSizing_reach_estimate` WHERE 1;

--
-- INSERT template for table `TargetingTemplateAudienceSizing_reach_estimate`
--
INSERT INTO `TargetingTemplateAudienceSizing_reach_estimate`(`estimate`, `lower_bound`, `upper_bound`) VALUES (?, ?, ?);

--
-- UPDATE template for table `TargetingTemplateAudienceSizing_reach_estimate`
--
UPDATE `TargetingTemplateAudienceSizing_reach_estimate` SET `estimate` = ?, `lower_bound` = ?, `upper_bound` = ? WHERE 1;

--
-- DELETE template for table `TargetingTemplateAudienceSizing_reach_estimate`
--
DELETE FROM `TargetingTemplateAudienceSizing_reach_estimate` WHERE 0;

