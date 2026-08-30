--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CatalogsUpdateCreativeAssetsItem' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'catalogs_update_creative_assets_item'
--
SELECT "attributes", creative_assets_id, operation FROM catalogs_update_creative_assets_item WHERE 1=1;

--
-- INSERT template for table 'catalogs_update_creative_assets_item'
--
INSERT INTO catalogs_update_creative_assets_item ("attributes", creative_assets_id, operation) VALUES (?, ?, ?);

--
-- UPDATE template for table 'catalogs_update_creative_assets_item'
--
UPDATE catalogs_update_creative_assets_item SET "attributes" = ?, creative_assets_id = ?, operation = ? WHERE 1=2;

--
-- DELETE template for table 'catalogs_update_creative_assets_item'
--
DELETE FROM catalogs_update_creative_assets_item WHERE 1=2;

