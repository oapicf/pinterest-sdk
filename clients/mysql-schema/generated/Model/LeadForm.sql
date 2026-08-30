--
-- Pinterest REST API.
-- Prepared SQL queries for 'LeadForm' definition.
--


--
-- SELECT template for table `LeadForm`
--
SELECT `ad_account_id`, `completion_message`, `created_time`, `disclosure_language`, `has_accepted_terms`, `id`, `name`, `policy_links`, `privacy_policy_link`, `questions`, `status`, `updated_time` FROM `LeadForm` WHERE 1;

--
-- INSERT template for table `LeadForm`
--
INSERT INTO `LeadForm`(`ad_account_id`, `completion_message`, `created_time`, `disclosure_language`, `has_accepted_terms`, `id`, `name`, `policy_links`, `privacy_policy_link`, `questions`, `status`, `updated_time`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `LeadForm`
--
UPDATE `LeadForm` SET `ad_account_id` = ?, `completion_message` = ?, `created_time` = ?, `disclosure_language` = ?, `has_accepted_terms` = ?, `id` = ?, `name` = ?, `policy_links` = ?, `privacy_policy_link` = ?, `questions` = ?, `status` = ?, `updated_time` = ? WHERE 1;

--
-- DELETE template for table `LeadForm`
--
DELETE FROM `LeadForm` WHERE 0;

