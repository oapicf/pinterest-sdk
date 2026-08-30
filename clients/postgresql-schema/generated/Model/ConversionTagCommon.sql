--
-- "Pinterest REST API"
-- Prepared SQL queries for 'ConversionTagCommon' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'conversion_tag_common'
--
SELECT code_snippet, configs, enhanced_match_status, "id", last_fired_time_ms, "name", "version" FROM conversion_tag_common WHERE 1=1;

--
-- INSERT template for table 'conversion_tag_common'
--
INSERT INTO conversion_tag_common (code_snippet, configs, enhanced_match_status, "id", last_fired_time_ms, "name", "version") VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'conversion_tag_common'
--
UPDATE conversion_tag_common SET code_snippet = ?, configs = ?, enhanced_match_status = ?, "id" = ?, last_fired_time_ms = ?, "name" = ?, "version" = ? WHERE 1=2;

--
-- DELETE template for table 'conversion_tag_common'
--
DELETE FROM conversion_tag_common WHERE 1=2;

