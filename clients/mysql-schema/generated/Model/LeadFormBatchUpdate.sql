--
-- Pinterest REST API.
-- Prepared SQL queries for 'LeadFormBatchUpdate' definition.
--


--
-- SELECT template for table `LeadFormBatchUpdate`
--
SELECT `completion_message`, `disclosure_language`, `has_accepted_terms`, `id`, `name`, `policy_links`, `privacy_policy_link`, `questions`, `status` FROM `LeadFormBatchUpdate` WHERE 1;

--
-- INSERT template for table `LeadFormBatchUpdate`
--
INSERT INTO `LeadFormBatchUpdate`(`completion_message`, `disclosure_language`, `has_accepted_terms`, `id`, `name`, `policy_links`, `privacy_policy_link`, `questions`, `status`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `LeadFormBatchUpdate`
--
UPDATE `LeadFormBatchUpdate` SET `completion_message` = ?, `disclosure_language` = ?, `has_accepted_terms` = ?, `id` = ?, `name` = ?, `policy_links` = ?, `privacy_policy_link` = ?, `questions` = ?, `status` = ? WHERE 1;

--
-- DELETE template for table `LeadFormBatchUpdate`
--
DELETE FROM `LeadFormBatchUpdate` WHERE 0;

