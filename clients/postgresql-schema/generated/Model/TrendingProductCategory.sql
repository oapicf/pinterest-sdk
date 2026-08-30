--
-- "Pinterest REST API"
-- Prepared SQL queries for 'TrendingProductCategory' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'trending_product_category'
--
SELECT engagement_type, pct_change_mom, percent_relative_volume, pinterest_product_category_id, product_category, verticals FROM trending_product_category WHERE 1=1;

--
-- INSERT template for table 'trending_product_category'
--
INSERT INTO trending_product_category (engagement_type, pct_change_mom, percent_relative_volume, pinterest_product_category_id, product_category, verticals) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'trending_product_category'
--
UPDATE trending_product_category SET engagement_type = ?, pct_change_mom = ?, percent_relative_volume = ?, pinterest_product_category_id = ?, product_category = ?, verticals = ? WHERE 1=2;

--
-- DELETE template for table 'trending_product_category'
--
DELETE FROM trending_product_category WHERE 1=2;

