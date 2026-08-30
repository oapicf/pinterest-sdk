--
-- Pinterest REST API.
-- Prepared SQL queries for 'LeadFormCreate' definition.
--


--
-- SELECT template for table `LeadFormCreate`
--
SELECT `completion_message`, `disclosure_language`, `has_accepted_terms`, `name`, `policy_links`, `privacy_policy_link`, `questions`, `status` FROM `LeadFormCreate` WHERE 1;

--
-- INSERT template for table `LeadFormCreate`
--
INSERT INTO `LeadFormCreate`(`completion_message`, `disclosure_language`, `has_accepted_terms`, `name`, `policy_links`, `privacy_policy_link`, `questions`, `status`) VALUES (?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `LeadFormCreate`
--
UPDATE `LeadFormCreate` SET `completion_message` = ?, `disclosure_language` = ?, `has_accepted_terms` = ?, `name` = ?, `policy_links` = ?, `privacy_policy_link` = ?, `questions` = ?, `status` = ? WHERE 1;

--
-- DELETE template for table `LeadFormCreate`
--
DELETE FROM `LeadFormCreate` WHERE 0;

