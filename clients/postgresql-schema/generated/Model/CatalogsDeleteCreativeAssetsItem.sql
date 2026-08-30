--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CatalogsDeleteCreativeAssetsItem' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'catalogs_delete_creative_assets_item'
--
SELECT creative_assets_id, operation FROM catalogs_delete_creative_assets_item WHERE 1=1;

--
-- INSERT template for table 'catalogs_delete_creative_assets_item'
--
INSERT INTO catalogs_delete_creative_assets_item (creative_assets_id, operation) VALUES (?, ?);

--
-- UPDATE template for table 'catalogs_delete_creative_assets_item'
--
UPDATE catalogs_delete_creative_assets_item SET creative_assets_id = ?, operation = ? WHERE 1=2;

--
-- DELETE template for table 'catalogs_delete_creative_assets_item'
--
DELETE FROM catalogs_delete_creative_assets_item WHERE 1=2;

