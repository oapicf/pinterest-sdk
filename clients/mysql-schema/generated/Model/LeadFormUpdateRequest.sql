--
-- Pinterest REST API.
-- Prepared SQL queries for 'LeadFormUpdateRequest' definition.
--


--
-- SELECT template for table `LeadFormUpdateRequest`
--
SELECT `completion_message`, `disclosure_language`, `has_accepted_terms`, `name`, `policy_links`, `privacy_policy_link`, `questions`, `status`, `id` FROM `LeadFormUpdateRequest` WHERE 1;

--
-- INSERT template for table `LeadFormUpdateRequest`
--
INSERT INTO `LeadFormUpdateRequest`(`completion_message`, `disclosure_language`, `has_accepted_terms`, `name`, `policy_links`, `privacy_policy_link`, `questions`, `status`, `id`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `LeadFormUpdateRequest`
--
UPDATE `LeadFormUpdateRequest` SET `completion_message` = ?, `disclosure_language` = ?, `has_accepted_terms` = ?, `name` = ?, `policy_links` = ?, `privacy_policy_link` = ?, `questions` = ?, `status` = ?, `id` = ? WHERE 1;

--
-- DELETE template for table `LeadFormUpdateRequest`
--
DELETE FROM `LeadFormUpdateRequest` WHERE 0;

