--
-- Pinterest REST API.
-- Prepared SQL queries for 'TargetingTemplateAudienceSizingReachEstimate' definition.
--


--
-- SELECT template for table `TargetingTemplateAudienceSizingReachEstimate`
--
SELECT `estimate`, `lower_bound`, `upper_bound` FROM `TargetingTemplateAudienceSizingReachEstimate` WHERE 1;

--
-- INSERT template for table `TargetingTemplateAudienceSizingReachEstimate`
--
INSERT INTO `TargetingTemplateAudienceSizingReachEstimate`(`estimate`, `lower_bound`, `upper_bound`) VALUES (?, ?, ?);

--
-- UPDATE template for table `TargetingTemplateAudienceSizingReachEstimate`
--
UPDATE `TargetingTemplateAudienceSizingReachEstimate` SET `estimate` = ?, `lower_bound` = ?, `upper_bound` = ? WHERE 1;

--
-- DELETE template for table `TargetingTemplateAudienceSizingReachEstimate`
--
DELETE FROM `TargetingTemplateAudienceSizingReachEstimate` WHERE 0;

