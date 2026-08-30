--
-- "Pinterest REST API"
-- Prepared SQL queries for 'ConversionTagConfigs' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'conversion_tag_configs'
--
SELECT aem_db_enabled, aem_enabled, aem_external_id_enabled, aem_fnln_enabled, aem_ge_enabled, aem_loc_enabled, aem_ph_enabled, md_frequency, no_code_capi_domains FROM conversion_tag_configs WHERE 1=1;

--
-- INSERT template for table 'conversion_tag_configs'
--
INSERT INTO conversion_tag_configs (aem_db_enabled, aem_enabled, aem_external_id_enabled, aem_fnln_enabled, aem_ge_enabled, aem_loc_enabled, aem_ph_enabled, md_frequency, no_code_capi_domains) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'conversion_tag_configs'
--
UPDATE conversion_tag_configs SET aem_db_enabled = ?, aem_enabled = ?, aem_external_id_enabled = ?, aem_fnln_enabled = ?, aem_ge_enabled = ?, aem_loc_enabled = ?, aem_ph_enabled = ?, md_frequency = ?, no_code_capi_domains = ? WHERE 1=2;

--
-- DELETE template for table 'conversion_tag_configs'
--
DELETE FROM conversion_tag_configs WHERE 1=2;

