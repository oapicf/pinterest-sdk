--
-- Pinterest REST API.
-- Prepared SQL queries for 'LeadFormUpdateRequest' definition.
--


--
-- SELECT template for table `LeadFormUpdateRequest`
--
SELECT `name`, `privacy_policy_link`, `has_accepted_terms`, `completion_message`, `status`, `disclosure_language`, `questions`, `policy_links`, `id` FROM `LeadFormUpdateRequest` WHERE 1;

--
-- INSERT template for table `LeadFormUpdateRequest`
--
INSERT INTO `LeadFormUpdateRequest`(`name`, `privacy_policy_link`, `has_accepted_terms`, `completion_message`, `status`, `disclosure_language`, `questions`, `policy_links`, `id`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `LeadFormUpdateRequest`
--
UPDATE `LeadFormUpdateRequest` SET `name` = ?, `privacy_policy_link` = ?, `has_accepted_terms` = ?, `completion_message` = ?, `status` = ?, `disclosure_language` = ?, `questions` = ?, `policy_links` = ?, `id` = ? WHERE 1;

--
-- DELETE template for table `LeadFormUpdateRequest`
--
DELETE FROM `LeadFormUpdateRequest` WHERE 0;

