--
-- "Pinterest REST API"
-- Prepared SQL queries for 'AdGroupCreateRequestAllOf1' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'ad_group_create_request_all_of1'
--
SELECT auto_targeting_enabled, bid_multiplier, budget_type, pacing_delivery_type FROM ad_group_create_request_all_of1 WHERE 1=1;

--
-- INSERT template for table 'ad_group_create_request_all_of1'
--
INSERT INTO ad_group_create_request_all_of1 (auto_targeting_enabled, bid_multiplier, budget_type, pacing_delivery_type) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'ad_group_create_request_all_of1'
--
UPDATE ad_group_create_request_all_of1 SET auto_targeting_enabled = ?, bid_multiplier = ?, budget_type = ?, pacing_delivery_type = ? WHERE 1=2;

--
-- DELETE template for table 'ad_group_create_request_all_of1'
--
DELETE FROM ad_group_create_request_all_of1 WHERE 1=2;

