--
-- "Pinterest REST API"
-- Prepared SQL queries for 'TargetingTemplate' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'targeting_template'
--
SELECT ad_account_id, auto_targeting_enabled, created_time, "id", keywords, "name", placement_group, sizing, status, targeting_attributes, tracking_urls, updated_time, "valid" FROM targeting_template WHERE 1=1;

--
-- INSERT template for table 'targeting_template'
--
INSERT INTO targeting_template (ad_account_id, auto_targeting_enabled, created_time, "id", keywords, "name", placement_group, sizing, status, targeting_attributes, tracking_urls, updated_time, "valid") VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'targeting_template'
--
UPDATE targeting_template SET ad_account_id = ?, auto_targeting_enabled = ?, created_time = ?, "id" = ?, keywords = ?, "name" = ?, placement_group = ?, sizing = ?, status = ?, targeting_attributes = ?, tracking_urls = ?, updated_time = ?, "valid" = ? WHERE 1=2;

--
-- DELETE template for table 'targeting_template'
--
DELETE FROM targeting_template WHERE 1=2;

