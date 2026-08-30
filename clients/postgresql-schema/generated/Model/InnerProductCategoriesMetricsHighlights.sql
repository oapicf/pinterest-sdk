--
-- "Pinterest REST API"
-- Prepared SQL queries for 'InnerProductCategoriesMetricsHighlights' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'inner_product_categories_metrics_highlights'
--
SELECT pct_change_mom FROM inner_product_categories_metrics_highlights WHERE 1=1;

--
-- INSERT template for table 'inner_product_categories_metrics_highlights'
--
INSERT INTO inner_product_categories_metrics_highlights (pct_change_mom) VALUES (?);

--
-- UPDATE template for table 'inner_product_categories_metrics_highlights'
--
UPDATE inner_product_categories_metrics_highlights SET pct_change_mom = ? WHERE 1=2;

--
-- DELETE template for table 'inner_product_categories_metrics_highlights'
--
DELETE FROM inner_product_categories_metrics_highlights WHERE 1=2;

