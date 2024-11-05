--
-- Pinterest REST API.
-- Prepared SQL queries for 'LeadFormCommon_policy_links_inner' definition.
--


--
-- SELECT template for table `LeadFormCommon_policy_links_inner`
--
SELECT `label`, `link` FROM `LeadFormCommon_policy_links_inner` WHERE 1;

--
-- INSERT template for table `LeadFormCommon_policy_links_inner`
--
INSERT INTO `LeadFormCommon_policy_links_inner`(`label`, `link`) VALUES (?, ?);

--
-- UPDATE template for table `LeadFormCommon_policy_links_inner`
--
UPDATE `LeadFormCommon_policy_links_inner` SET `label` = ?, `link` = ? WHERE 1;

--
-- DELETE template for table `LeadFormCommon_policy_links_inner`
--
DELETE FROM `LeadFormCommon_policy_links_inner` WHERE 0;

