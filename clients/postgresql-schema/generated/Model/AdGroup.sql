--
-- "Pinterest REST API"
-- Prepared SQL queries for 'AdGroup' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'ad_group'
--
SELECT ad_account_id, bid_in_micro_currency, bid_strategy_type, billable_event, budget_in_micro_currency, campaign_id, conversion_learning_mode_type, created_time, customer_segment_id, dca_assets, end_time, ext_features, feed_profile_id, "id", is_creative_optimization, is_local_inventory, lifetime_frequency_cap, local_inventory_radius_in_miles, "name", optimization_goal_metadata, performance_plus_campaign_settings, placement_group, placement_traffic_type, promotion_application_level, promotion_id, promotion_ids, start_time, status, summary_status, targeting_spec, targeting_template_ids, tracking_urls, "type", updated_time, auto_targeting_enabled, bid_multiplier, budget_type, pacing_delivery_type FROM ad_group WHERE 1=1;

--
-- INSERT template for table 'ad_group'
--
INSERT INTO ad_group (ad_account_id, bid_in_micro_currency, bid_strategy_type, billable_event, budget_in_micro_currency, campaign_id, conversion_learning_mode_type, created_time, customer_segment_id, dca_assets, end_time, ext_features, feed_profile_id, "id", is_creative_optimization, is_local_inventory, lifetime_frequency_cap, local_inventory_radius_in_miles, "name", optimization_goal_metadata, performance_plus_campaign_settings, placement_group, placement_traffic_type, promotion_application_level, promotion_id, promotion_ids, start_time, status, summary_status, targeting_spec, targeting_template_ids, tracking_urls, "type", updated_time, auto_targeting_enabled, bid_multiplier, budget_type, pacing_delivery_type) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'ad_group'
--
UPDATE ad_group SET ad_account_id = ?, bid_in_micro_currency = ?, bid_strategy_type = ?, billable_event = ?, budget_in_micro_currency = ?, campaign_id = ?, conversion_learning_mode_type = ?, created_time = ?, customer_segment_id = ?, dca_assets = ?, end_time = ?, ext_features = ?, feed_profile_id = ?, "id" = ?, is_creative_optimization = ?, is_local_inventory = ?, lifetime_frequency_cap = ?, local_inventory_radius_in_miles = ?, "name" = ?, optimization_goal_metadata = ?, performance_plus_campaign_settings = ?, placement_group = ?, placement_traffic_type = ?, promotion_application_level = ?, promotion_id = ?, promotion_ids = ?, start_time = ?, status = ?, summary_status = ?, targeting_spec = ?, targeting_template_ids = ?, tracking_urls = ?, "type" = ?, updated_time = ?, auto_targeting_enabled = ?, bid_multiplier = ?, budget_type = ?, pacing_delivery_type = ? WHERE 1=2;

--
-- DELETE template for table 'ad_group'
--
DELETE FROM ad_group WHERE 1=2;

