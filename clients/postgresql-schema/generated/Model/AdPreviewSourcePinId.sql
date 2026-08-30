--
-- "Pinterest REST API"
-- Prepared SQL queries for 'AdPreviewSourcePinId' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'ad_preview_source_pin_id'
--
SELECT creative_type, pin_id FROM ad_preview_source_pin_id WHERE 1=1;

--
-- INSERT template for table 'ad_preview_source_pin_id'
--
INSERT INTO ad_preview_source_pin_id (creative_type, pin_id) VALUES (?, ?);

--
-- UPDATE template for table 'ad_preview_source_pin_id'
--
UPDATE ad_preview_source_pin_id SET creative_type = ?, pin_id = ? WHERE 1=2;

--
-- DELETE template for table 'ad_preview_source_pin_id'
--
DELETE FROM ad_preview_source_pin_id WHERE 1=2;

