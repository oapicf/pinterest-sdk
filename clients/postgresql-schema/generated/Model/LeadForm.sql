--
-- "Pinterest REST API"
-- Prepared SQL queries for 'LeadForm' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'lead_form'
--
SELECT ad_account_id, completion_message, created_time, disclosure_language, has_accepted_terms, "id", "name", policy_links, privacy_policy_link, questions, status, updated_time FROM lead_form WHERE 1=1;

--
-- INSERT template for table 'lead_form'
--
INSERT INTO lead_form (ad_account_id, completion_message, created_time, disclosure_language, has_accepted_terms, "id", "name", policy_links, privacy_policy_link, questions, status, updated_time) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'lead_form'
--
UPDATE lead_form SET ad_account_id = ?, completion_message = ?, created_time = ?, disclosure_language = ?, has_accepted_terms = ?, "id" = ?, "name" = ?, policy_links = ?, privacy_policy_link = ?, questions = ?, status = ?, updated_time = ? WHERE 1=2;

--
-- DELETE template for table 'lead_form'
--
DELETE FROM lead_form WHERE 1=2;

