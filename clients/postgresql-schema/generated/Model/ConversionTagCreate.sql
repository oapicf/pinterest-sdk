--
-- "Pinterest REST API"
-- Prepared SQL queries for 'ConversionTagCreate' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'conversion_tag_create'
--
SELECT aem_db_enabled, aem_enabled, aem_external_id_enabled, aem_fnln_enabled, aem_ge_enabled, aem_loc_enabled, aem_ph_enabled, md_frequency, "name" FROM conversion_tag_create WHERE 1=1;

--
-- INSERT template for table 'conversion_tag_create'
--
INSERT INTO conversion_tag_create (aem_db_enabled, aem_enabled, aem_external_id_enabled, aem_fnln_enabled, aem_ge_enabled, aem_loc_enabled, aem_ph_enabled, md_frequency, "name") VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'conversion_tag_create'
--
UPDATE conversion_tag_create SET aem_db_enabled = ?, aem_enabled = ?, aem_external_id_enabled = ?, aem_fnln_enabled = ?, aem_ge_enabled = ?, aem_loc_enabled = ?, aem_ph_enabled = ?, md_frequency = ?, "name" = ? WHERE 1=2;

--
-- DELETE template for table 'conversion_tag_create'
--
DELETE FROM conversion_tag_create WHERE 1=2;

