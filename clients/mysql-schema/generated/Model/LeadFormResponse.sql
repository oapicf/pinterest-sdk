--
-- Pinterest REST API.
-- Prepared SQL queries for 'LeadFormResponse' definition.
--


--
-- SELECT template for table `LeadFormResponse`
--
SELECT `name`, `privacy_policy_link`, `has_accepted_terms`, `completion_message`, `status`, `disclosure_language`, `questions`, `id`, `ad_account_id`, `created_time`, `updated_time` FROM `LeadFormResponse` WHERE 1;

--
-- INSERT template for table `LeadFormResponse`
--
INSERT INTO `LeadFormResponse`(`name`, `privacy_policy_link`, `has_accepted_terms`, `completion_message`, `status`, `disclosure_language`, `questions`, `id`, `ad_account_id`, `created_time`, `updated_time`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `LeadFormResponse`
--
UPDATE `LeadFormResponse` SET `name` = ?, `privacy_policy_link` = ?, `has_accepted_terms` = ?, `completion_message` = ?, `status` = ?, `disclosure_language` = ?, `questions` = ?, `id` = ?, `ad_account_id` = ?, `created_time` = ?, `updated_time` = ? WHERE 1;

--
-- DELETE template for table `LeadFormResponse`
--
DELETE FROM `LeadFormResponse` WHERE 0;

