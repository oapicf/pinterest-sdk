--
-- Pinterest REST API.
-- Prepared SQL queries for 'LeadFormResponse' definition.
--


--
-- SELECT template for table `LeadFormResponse`
--
SELECT `completion_message`, `disclosure_language`, `has_accepted_terms`, `name`, `policy_links`, `privacy_policy_link`, `questions`, `status`, `ad_account_id`, `created_time`, `id`, `updated_time` FROM `LeadFormResponse` WHERE 1;

--
-- INSERT template for table `LeadFormResponse`
--
INSERT INTO `LeadFormResponse`(`completion_message`, `disclosure_language`, `has_accepted_terms`, `name`, `policy_links`, `privacy_policy_link`, `questions`, `status`, `ad_account_id`, `created_time`, `id`, `updated_time`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `LeadFormResponse`
--
UPDATE `LeadFormResponse` SET `completion_message` = ?, `disclosure_language` = ?, `has_accepted_terms` = ?, `name` = ?, `policy_links` = ?, `privacy_policy_link` = ?, `questions` = ?, `status` = ?, `ad_account_id` = ?, `created_time` = ?, `id` = ?, `updated_time` = ? WHERE 1;

--
-- DELETE template for table `LeadFormResponse`
--
DELETE FROM `LeadFormResponse` WHERE 0;

