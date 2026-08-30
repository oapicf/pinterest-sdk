--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CreativeAssetsIdFilter' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'creative_assets_id_filter'
--
SELECT creative_assets_id FROM creative_assets_id_filter WHERE 1=1;

--
-- INSERT template for table 'creative_assets_id_filter'
--
INSERT INTO creative_assets_id_filter (creative_assets_id) VALUES (?);

--
-- UPDATE template for table 'creative_assets_id_filter'
--
UPDATE creative_assets_id_filter SET creative_assets_id = ? WHERE 1=2;

--
-- DELETE template for table 'creative_assets_id_filter'
--
DELETE FROM creative_assets_id_filter WHERE 1=2;

