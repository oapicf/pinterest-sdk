--
-- Pinterest REST API.
-- Prepared SQL queries for 'LeadFormCommon' definition.
--


--
-- SELECT template for table `LeadFormCommon`
--
SELECT `completion_message`, `disclosure_language`, `has_accepted_terms`, `name`, `policy_links`, `privacy_policy_link`, `questions`, `status` FROM `LeadFormCommon` WHERE 1;

--
-- INSERT template for table `LeadFormCommon`
--
INSERT INTO `LeadFormCommon`(`completion_message`, `disclosure_language`, `has_accepted_terms`, `name`, `policy_links`, `privacy_policy_link`, `questions`, `status`) VALUES (?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `LeadFormCommon`
--
UPDATE `LeadFormCommon` SET `completion_message` = ?, `disclosure_language` = ?, `has_accepted_terms` = ?, `name` = ?, `policy_links` = ?, `privacy_policy_link` = ?, `questions` = ?, `status` = ? WHERE 1;

--
-- DELETE template for table `LeadFormCommon`
--
DELETE FROM `LeadFormCommon` WHERE 0;

