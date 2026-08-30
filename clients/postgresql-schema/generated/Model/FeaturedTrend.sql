--
-- "Pinterest REST API"
-- Prepared SQL queries for 'FeaturedTrend' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'featured_trend'
--
SELECT interest, market, trends FROM featured_trend WHERE 1=1;

--
-- INSERT template for table 'featured_trend'
--
INSERT INTO featured_trend (interest, market, trends) VALUES (?, ?, ?);

--
-- UPDATE template for table 'featured_trend'
--
UPDATE featured_trend SET interest = ?, market = ?, trends = ? WHERE 1=2;

--
-- DELETE template for table 'featured_trend'
--
DELETE FROM featured_trend WHERE 1=2;

