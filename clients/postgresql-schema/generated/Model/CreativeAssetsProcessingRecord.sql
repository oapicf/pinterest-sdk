--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CreativeAssetsProcessingRecord' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'creative_assets_processing_record'
--
SELECT creative_assets_id, errors, status, warnings FROM creative_assets_processing_record WHERE 1=1;

--
-- INSERT template for table 'creative_assets_processing_record'
--
INSERT INTO creative_assets_processing_record (creative_assets_id, errors, status, warnings) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'creative_assets_processing_record'
--
UPDATE creative_assets_processing_record SET creative_assets_id = ?, errors = ?, status = ?, warnings = ? WHERE 1=2;

--
-- DELETE template for table 'creative_assets_processing_record'
--
DELETE FROM creative_assets_processing_record WHERE 1=2;

