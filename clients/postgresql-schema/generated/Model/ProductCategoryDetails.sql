--
-- "Pinterest REST API"
-- Prepared SQL queries for 'ProductCategoryDetails' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'product_category_details'
--
SELECT demographics, has_prediction, metrics_highlights, predicted_time_series, product_category, related_searches, time_series FROM product_category_details WHERE 1=1;

--
-- INSERT template for table 'product_category_details'
--
INSERT INTO product_category_details (demographics, has_prediction, metrics_highlights, predicted_time_series, product_category, related_searches, time_series) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'product_category_details'
--
UPDATE product_category_details SET demographics = ?, has_prediction = ?, metrics_highlights = ?, predicted_time_series = ?, product_category = ?, related_searches = ?, time_series = ? WHERE 1=2;

--
-- DELETE template for table 'product_category_details'
--
DELETE FROM product_category_details WHERE 1=2;

