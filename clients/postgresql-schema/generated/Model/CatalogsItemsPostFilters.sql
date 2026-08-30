--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CatalogsItemsPostFilters' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'catalogs_items_post_filters'
--
SELECT catalog_id, catalog_type, item_ids, hotel_ids, creative_assets_ids FROM catalogs_items_post_filters WHERE 1=1;

--
-- INSERT template for table 'catalogs_items_post_filters'
--
INSERT INTO catalogs_items_post_filters (catalog_id, catalog_type, item_ids, hotel_ids, creative_assets_ids) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table 'catalogs_items_post_filters'
--
UPDATE catalogs_items_post_filters SET catalog_id = ?, catalog_type = ?, item_ids = ?, hotel_ids = ?, creative_assets_ids = ? WHERE 1=2;

--
-- DELETE template for table 'catalogs_items_post_filters'
--
DELETE FROM catalogs_items_post_filters WHERE 1=2;

