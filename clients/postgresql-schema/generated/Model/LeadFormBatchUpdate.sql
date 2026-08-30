--
-- "Pinterest REST API"
-- Prepared SQL queries for 'LeadFormBatchUpdate' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'lead_form_batch_update'
--
SELECT completion_message, disclosure_language, has_accepted_terms, "id", "name", policy_links, privacy_policy_link, questions, status FROM lead_form_batch_update WHERE 1=1;

--
-- INSERT template for table 'lead_form_batch_update'
--
INSERT INTO lead_form_batch_update (completion_message, disclosure_language, has_accepted_terms, "id", "name", policy_links, privacy_policy_link, questions, status) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'lead_form_batch_update'
--
UPDATE lead_form_batch_update SET completion_message = ?, disclosure_language = ?, has_accepted_terms = ?, "id" = ?, "name" = ?, policy_links = ?, privacy_policy_link = ?, questions = ?, status = ? WHERE 1=2;

--
-- DELETE template for table 'lead_form_batch_update'
--
DELETE FROM lead_form_batch_update WHERE 1=2;

