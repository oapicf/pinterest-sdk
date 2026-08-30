--
-- "Pinterest REST API"
-- Prepared SQL queries for 'LeadFormCreate' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'lead_form_create'
--
SELECT completion_message, disclosure_language, has_accepted_terms, "name", policy_links, privacy_policy_link, questions, status FROM lead_form_create WHERE 1=1;

--
-- INSERT template for table 'lead_form_create'
--
INSERT INTO lead_form_create (completion_message, disclosure_language, has_accepted_terms, "name", policy_links, privacy_policy_link, questions, status) VALUES (?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'lead_form_create'
--
UPDATE lead_form_create SET completion_message = ?, disclosure_language = ?, has_accepted_terms = ?, "name" = ?, policy_links = ?, privacy_policy_link = ?, questions = ?, status = ? WHERE 1=2;

--
-- DELETE template for table 'lead_form_create'
--
DELETE FROM lead_form_create WHERE 1=2;

