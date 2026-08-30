--
-- "Pinterest REST API"
-- Prepared SQL queries for 'ConversionTag' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'conversion_tag'
--
SELECT code_snippet, configs, enhanced_match_status, "id", last_fired_time_ms, "name", "version", ad_account_id, status FROM conversion_tag WHERE 1=1;

--
-- INSERT template for table 'conversion_tag'
--
INSERT INTO conversion_tag (code_snippet, configs, enhanced_match_status, "id", last_fired_time_ms, "name", "version", ad_account_id, status) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'conversion_tag'
--
UPDATE conversion_tag SET code_snippet = ?, configs = ?, enhanced_match_status = ?, "id" = ?, last_fired_time_ms = ?, "name" = ?, "version" = ?, ad_account_id = ?, status = ? WHERE 1=2;

--
-- DELETE template for table 'conversion_tag'
--
DELETE FROM conversion_tag WHERE 1=2;

