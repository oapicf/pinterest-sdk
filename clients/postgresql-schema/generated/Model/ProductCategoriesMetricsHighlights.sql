--
-- "Pinterest REST API"
-- Prepared SQL queries for 'ProductCategoriesMetricsHighlights' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'product_categories_metrics_highlights'
--
SELECT engagement, outbound_clicks, pin_saves FROM product_categories_metrics_highlights WHERE 1=1;

--
-- INSERT template for table 'product_categories_metrics_highlights'
--
INSERT INTO product_categories_metrics_highlights (engagement, outbound_clicks, pin_saves) VALUES (?, ?, ?);

--
-- UPDATE template for table 'product_categories_metrics_highlights'
--
UPDATE product_categories_metrics_highlights SET engagement = ?, outbound_clicks = ?, pin_saves = ? WHERE 1=2;

--
-- DELETE template for table 'product_categories_metrics_highlights'
--
DELETE FROM product_categories_metrics_highlights WHERE 1=2;

