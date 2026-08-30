--
-- "Pinterest REST API"
-- Prepared SQL queries for 'ItemResponse' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'item_response'
--
SELECT "attributes", catalog_type, item_id, item_response_kind, pins, hotel_id, creative_assets_id, errors FROM item_response WHERE 1=1;

--
-- INSERT template for table 'item_response'
--
INSERT INTO item_response ("attributes", catalog_type, item_id, item_response_kind, pins, hotel_id, creative_assets_id, errors) VALUES (?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'item_response'
--
UPDATE item_response SET "attributes" = ?, catalog_type = ?, item_id = ?, item_response_kind = ?, pins = ?, hotel_id = ?, creative_assets_id = ?, errors = ? WHERE 1=2;

--
-- DELETE template for table 'item_response'
--
DELETE FROM item_response WHERE 1=2;

