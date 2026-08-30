--
-- "Pinterest REST API"
-- Prepared SQL queries for 'AdGroupCreateRequest' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'ad_group_create_request'
--
SELECT auto_targeting_enabled, bid_multiplier, budget_type, pacing_delivery_type, bid_in_micro_currency, bid_strategy_type, billable_event, budget_in_micro_currency, campaign_id, end_time, is_creative_optimization, lifetime_frequency_cap, "name", optimization_goal_metadata, placement_group, promotion_application_level, promotion_id, promotion_ids, start_time, status, targeting_spec, targeting_template_ids, tracking_urls FROM ad_group_create_request WHERE 1=1;

--
-- INSERT template for table 'ad_group_create_request'
--
INSERT INTO ad_group_create_request (auto_targeting_enabled, bid_multiplier, budget_type, pacing_delivery_type, bid_in_micro_currency, bid_strategy_type, billable_event, budget_in_micro_currency, campaign_id, end_time, is_creative_optimization, lifetime_frequency_cap, "name", optimization_goal_metadata, placement_group, promotion_application_level, promotion_id, promotion_ids, start_time, status, targeting_spec, targeting_template_ids, tracking_urls) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'ad_group_create_request'
--
UPDATE ad_group_create_request SET auto_targeting_enabled = ?, bid_multiplier = ?, budget_type = ?, pacing_delivery_type = ?, bid_in_micro_currency = ?, bid_strategy_type = ?, billable_event = ?, budget_in_micro_currency = ?, campaign_id = ?, end_time = ?, is_creative_optimization = ?, lifetime_frequency_cap = ?, "name" = ?, optimization_goal_metadata = ?, placement_group = ?, promotion_application_level = ?, promotion_id = ?, promotion_ids = ?, start_time = ?, status = ?, targeting_spec = ?, targeting_template_ids = ?, tracking_urls = ? WHERE 1=2;

--
-- DELETE template for table 'ad_group_create_request'
--
DELETE FROM ad_group_create_request WHERE 1=2;

