--
-- "Pinterest REST API"
-- Prepared SQL queries for 'LeadFormQuestion' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'lead_form_question'
--
SELECT custom_question_field_type, custom_question_label, custom_question_options, question_type FROM lead_form_question WHERE 1=1;

--
-- INSERT template for table 'lead_form_question'
--
INSERT INTO lead_form_question (custom_question_field_type, custom_question_label, custom_question_options, question_type) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'lead_form_question'
--
UPDATE lead_form_question SET custom_question_field_type = ?, custom_question_label = ?, custom_question_options = ?, question_type = ? WHERE 1=2;

--
-- DELETE template for table 'lead_form_question'
--
DELETE FROM lead_form_question WHERE 1=2;

