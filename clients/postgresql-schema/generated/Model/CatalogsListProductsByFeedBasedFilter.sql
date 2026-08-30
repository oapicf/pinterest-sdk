--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CatalogsListProductsByFeedBasedFilter' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'catalogs_list_products_by_feed_based_filter'
--
SELECT feed_id, filters FROM catalogs_list_products_by_feed_based_filter WHERE 1=1;

--
-- INSERT template for table 'catalogs_list_products_by_feed_based_filter'
--
INSERT INTO catalogs_list_products_by_feed_based_filter (feed_id, filters) VALUES (?, ?);

--
-- UPDATE template for table 'catalogs_list_products_by_feed_based_filter'
--
UPDATE catalogs_list_products_by_feed_based_filter SET feed_id = ?, filters = ? WHERE 1=2;

--
-- DELETE template for table 'catalogs_list_products_by_feed_based_filter'
--
DELETE FROM catalogs_list_products_by_feed_based_filter WHERE 1=2;

