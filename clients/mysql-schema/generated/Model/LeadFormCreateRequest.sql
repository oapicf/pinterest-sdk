--
-- Pinterest REST API.
-- Prepared SQL queries for 'LeadFormCreateRequest' definition.
--


--
-- SELECT template for table `LeadFormCreateRequest`
--
SELECT `name`, `privacy_policy_link`, `has_accepted_terms`, `completion_message`, `status`, `disclosure_language`, `questions`, `policy_links` FROM `LeadFormCreateRequest` WHERE 1;

--
-- INSERT template for table `LeadFormCreateRequest`
--
INSERT INTO `LeadFormCreateRequest`(`name`, `privacy_policy_link`, `has_accepted_terms`, `completion_message`, `status`, `disclosure_language`, `questions`, `policy_links`) VALUES (?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `LeadFormCreateRequest`
--
UPDATE `LeadFormCreateRequest` SET `name` = ?, `privacy_policy_link` = ?, `has_accepted_terms` = ?, `completion_message` = ?, `status` = ?, `disclosure_language` = ?, `questions` = ?, `policy_links` = ? WHERE 1;

--
-- DELETE template for table `LeadFormCreateRequest`
--
DELETE FROM `LeadFormCreateRequest` WHERE 0;

