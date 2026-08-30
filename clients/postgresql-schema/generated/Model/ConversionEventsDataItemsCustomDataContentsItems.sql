--
-- "Pinterest REST API"
-- Prepared SQL queries for 'ConversionEventsDataItemsCustomDataContentsItems' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'conversion_events_data_items_custom_data_contents_items'
--
SELECT "id", item_brand, item_brand_id, item_category, item_name, item_price, quantity FROM conversion_events_data_items_custom_data_contents_items WHERE 1=1;

--
-- INSERT template for table 'conversion_events_data_items_custom_data_contents_items'
--
INSERT INTO conversion_events_data_items_custom_data_contents_items ("id", item_brand, item_brand_id, item_category, item_name, item_price, quantity) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'conversion_events_data_items_custom_data_contents_items'
--
UPDATE conversion_events_data_items_custom_data_contents_items SET "id" = ?, item_brand = ?, item_brand_id = ?, item_category = ?, item_name = ?, item_price = ?, quantity = ? WHERE 1=2;

--
-- DELETE template for table 'conversion_events_data_items_custom_data_contents_items'
--
DELETE FROM conversion_events_data_items_custom_data_contents_items WHERE 1=2;

