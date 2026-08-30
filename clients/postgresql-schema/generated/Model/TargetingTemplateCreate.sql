--
-- "Pinterest REST API"
-- Prepared SQL queries for 'TargetingTemplateCreate' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'targeting_template_create'
--
SELECT auto_targeting_enabled, keywords, "name", placement_group, targeting_attributes, tracking_urls FROM targeting_template_create WHERE 1=1;

--
-- INSERT template for table 'targeting_template_create'
--
INSERT INTO targeting_template_create (auto_targeting_enabled, keywords, "name", placement_group, targeting_attributes, tracking_urls) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'targeting_template_create'
--
UPDATE targeting_template_create SET auto_targeting_enabled = ?, keywords = ?, "name" = ?, placement_group = ?, targeting_attributes = ?, tracking_urls = ? WHERE 1=2;

--
-- DELETE template for table 'targeting_template_create'
--
DELETE FROM targeting_template_create WHERE 1=2;

