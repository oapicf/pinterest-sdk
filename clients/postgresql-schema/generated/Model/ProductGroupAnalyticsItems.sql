--
-- "Pinterest REST API"
-- Prepared SQL queries for 'ProductGroupAnalyticsItems' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'product_group_analytics_items'
--
SELECT "date", product_group_id FROM product_group_analytics_items WHERE 1=1;

--
-- INSERT template for table 'product_group_analytics_items'
--
INSERT INTO product_group_analytics_items ("date", product_group_id) VALUES (?, ?);

--
-- UPDATE template for table 'product_group_analytics_items'
--
UPDATE product_group_analytics_items SET "date" = ?, product_group_id = ? WHERE 1=2;

--
-- DELETE template for table 'product_group_analytics_items'
--
DELETE FROM product_group_analytics_items WHERE 1=2;

