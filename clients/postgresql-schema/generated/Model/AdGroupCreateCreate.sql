--
-- "Pinterest REST API"
-- Prepared SQL queries for 'AdGroupCreateCreate' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'ad_group_create_create'
--
SELECT auto_targeting_enabled, bid_in_micro_currency, bid_multiplier, bid_strategy_type, billable_event, budget_in_micro_currency, budget_type, campaign_id, customer_segment_id, end_time, ext_features, feed_profile_id, is_creative_optimization, is_local_inventory, lifetime_frequency_cap, local_inventory_radius_in_miles, "name", optimization_goal_metadata, pacing_delivery_type, performance_plus_campaign_settings, placement_group, placement_traffic_type, promotion_application_level, promotion_id, promotion_ids, start_time, status, targeting_spec, targeting_template_ids, tracking_urls FROM ad_group_create_create WHERE 1=1;

--
-- INSERT template for table 'ad_group_create_create'
--
INSERT INTO ad_group_create_create (auto_targeting_enabled, bid_in_micro_currency, bid_multiplier, bid_strategy_type, billable_event, budget_in_micro_currency, budget_type, campaign_id, customer_segment_id, end_time, ext_features, feed_profile_id, is_creative_optimization, is_local_inventory, lifetime_frequency_cap, local_inventory_radius_in_miles, "name", optimization_goal_metadata, pacing_delivery_type, performance_plus_campaign_settings, placement_group, placement_traffic_type, promotion_application_level, promotion_id, promotion_ids, start_time, status, targeting_spec, targeting_template_ids, tracking_urls) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'ad_group_create_create'
--
UPDATE ad_group_create_create SET auto_targeting_enabled = ?, bid_in_micro_currency = ?, bid_multiplier = ?, bid_strategy_type = ?, billable_event = ?, budget_in_micro_currency = ?, budget_type = ?, campaign_id = ?, customer_segment_id = ?, end_time = ?, ext_features = ?, feed_profile_id = ?, is_creative_optimization = ?, is_local_inventory = ?, lifetime_frequency_cap = ?, local_inventory_radius_in_miles = ?, "name" = ?, optimization_goal_metadata = ?, pacing_delivery_type = ?, performance_plus_campaign_settings = ?, placement_group = ?, placement_traffic_type = ?, promotion_application_level = ?, promotion_id = ?, promotion_ids = ?, start_time = ?, status = ?, targeting_spec = ?, targeting_template_ids = ?, tracking_urls = ? WHERE 1=2;

--
-- DELETE template for table 'ad_group_create_create'
--
DELETE FROM ad_group_create_create WHERE 1=2;

