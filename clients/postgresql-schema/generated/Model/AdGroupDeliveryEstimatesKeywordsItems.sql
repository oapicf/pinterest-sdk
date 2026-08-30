--
-- "Pinterest REST API"
-- Prepared SQL queries for 'AdGroupDeliveryEstimatesKeywordsItems' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'ad_group_delivery_estimates_keywords_items'
--
SELECT match_type, "value" FROM ad_group_delivery_estimates_keywords_items WHERE 1=1;

--
-- INSERT template for table 'ad_group_delivery_estimates_keywords_items'
--
INSERT INTO ad_group_delivery_estimates_keywords_items (match_type, "value") VALUES (?, ?);

--
-- UPDATE template for table 'ad_group_delivery_estimates_keywords_items'
--
UPDATE ad_group_delivery_estimates_keywords_items SET match_type = ?, "value" = ? WHERE 1=2;

--
-- DELETE template for table 'ad_group_delivery_estimates_keywords_items'
--
DELETE FROM ad_group_delivery_estimates_keywords_items WHERE 1=2;

