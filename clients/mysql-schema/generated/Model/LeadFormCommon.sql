--
-- Pinterest REST API.
-- Prepared SQL queries for 'LeadFormCommon' definition.
--


--
-- SELECT template for table `LeadFormCommon`
--
SELECT `name`, `privacy_policy_link`, `has_accepted_terms`, `completion_message`, `status`, `disclosure_language`, `questions`, `policy_links` FROM `LeadFormCommon` WHERE 1;

--
-- INSERT template for table `LeadFormCommon`
--
INSERT INTO `LeadFormCommon`(`name`, `privacy_policy_link`, `has_accepted_terms`, `completion_message`, `status`, `disclosure_language`, `questions`, `policy_links`) VALUES (?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `LeadFormCommon`
--
UPDATE `LeadFormCommon` SET `name` = ?, `privacy_policy_link` = ?, `has_accepted_terms` = ?, `completion_message` = ?, `status` = ?, `disclosure_language` = ?, `questions` = ?, `policy_links` = ? WHERE 1;

--
-- DELETE template for table `LeadFormCommon`
--
DELETE FROM `LeadFormCommon` WHERE 0;

