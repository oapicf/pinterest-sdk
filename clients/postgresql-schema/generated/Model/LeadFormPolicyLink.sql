--
-- "Pinterest REST API"
-- Prepared SQL queries for 'LeadFormPolicyLink' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'lead_form_policy_link'
--
SELECT "label", "link" FROM lead_form_policy_link WHERE 1=1;

--
-- INSERT template for table 'lead_form_policy_link'
--
INSERT INTO lead_form_policy_link ("label", "link") VALUES (?, ?);

--
-- UPDATE template for table 'lead_form_policy_link'
--
UPDATE lead_form_policy_link SET "label" = ?, "link" = ? WHERE 1=2;

--
-- DELETE template for table 'lead_form_policy_link'
--
DELETE FROM lead_form_policy_link WHERE 1=2;

