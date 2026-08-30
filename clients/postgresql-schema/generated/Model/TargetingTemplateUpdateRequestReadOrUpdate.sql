--
-- "Pinterest REST API"
-- Prepared SQL queries for 'TargetingTemplateUpdateRequestReadOrUpdate' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'targeting_template_update_request_read_or_update'
--
SELECT "id", operation_type, targeting_attributes FROM targeting_template_update_request_read_or_update WHERE 1=1;

--
-- INSERT template for table 'targeting_template_update_request_read_or_update'
--
INSERT INTO targeting_template_update_request_read_or_update ("id", operation_type, targeting_attributes) VALUES (?, ?, ?);

--
-- UPDATE template for table 'targeting_template_update_request_read_or_update'
--
UPDATE targeting_template_update_request_read_or_update SET "id" = ?, operation_type = ?, targeting_attributes = ? WHERE 1=2;

--
-- DELETE template for table 'targeting_template_update_request_read_or_update'
--
DELETE FROM targeting_template_update_request_read_or_update WHERE 1=2;

