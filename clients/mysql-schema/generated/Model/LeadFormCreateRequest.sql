--
-- Pinterest REST API.
-- Prepared SQL queries for 'LeadFormCreateRequest' definition.
--


--
-- SELECT template for table `LeadFormCreateRequest`
--
SELECT `completion_message`, `disclosure_language`, `has_accepted_terms`, `name`, `policy_links`, `privacy_policy_link`, `questions`, `status` FROM `LeadFormCreateRequest` WHERE 1;

--
-- INSERT template for table `LeadFormCreateRequest`
--
INSERT INTO `LeadFormCreateRequest`(`completion_message`, `disclosure_language`, `has_accepted_terms`, `name`, `policy_links`, `privacy_policy_link`, `questions`, `status`) VALUES (?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `LeadFormCreateRequest`
--
UPDATE `LeadFormCreateRequest` SET `completion_message` = ?, `disclosure_language` = ?, `has_accepted_terms` = ?, `name` = ?, `policy_links` = ?, `privacy_policy_link` = ?, `questions` = ?, `status` = ? WHERE 1;

--
-- DELETE template for table `LeadFormCreateRequest`
--
DELETE FROM `LeadFormCreateRequest` WHERE 0;

