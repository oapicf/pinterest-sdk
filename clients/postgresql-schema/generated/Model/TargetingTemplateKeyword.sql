--
-- "Pinterest REST API"
-- Prepared SQL queries for 'TargetingTemplateKeyword' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'targeting_template_keyword'
--
SELECT match_type, "value" FROM targeting_template_keyword WHERE 1=1;

--
-- INSERT template for table 'targeting_template_keyword'
--
INSERT INTO targeting_template_keyword (match_type, "value") VALUES (?, ?);

--
-- UPDATE template for table 'targeting_template_keyword'
--
UPDATE targeting_template_keyword SET match_type = ?, "value" = ? WHERE 1=2;

--
-- DELETE template for table 'targeting_template_keyword'
--
DELETE FROM targeting_template_keyword WHERE 1=2;

