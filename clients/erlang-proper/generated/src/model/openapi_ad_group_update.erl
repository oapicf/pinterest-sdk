-module(openapi_ad_group_update).

-include("openapi.hrl").

-export([openapi_ad_group_update/0]).

-export([openapi_ad_group_update/1]).

-export_type([openapi_ad_group_update/0]).

-type openapi_ad_group_update() ::
  [ {'ad_account_id', binary() }
  | {'bid_in_micro_currency', integer() }
  | {'bid_strategy_type', openapi_bid_strategy_type:openapi_bid_strategy_type() }
  | {'billable_event', openapi_action_type:openapi_action_type() }
  | {'budget_in_micro_currency', integer() }
  | {'campaign_id', binary() }
  | {'conversion_learning_mode_type', openapi_conversion_learning_mode_type:openapi_conversion_learning_mode_type() }
  | {'created_time', integer() }
  | {'customer_segment_id', binary() }
  | {'dca_assets', openapi_any_type:openapi_any_type() }
  | {'end_time', integer() }
  | {'ext_features', openapi_adgroup_tracking_features:openapi_adgroup_tracking_features() }
  | {'feed_profile_id', binary() }
  | {'id', binary() }
  | {'is_creative_optimization', boolean() }
  | {'is_local_inventory', boolean() }
  | {'lifetime_frequency_cap', integer() }
  | {'local_inventory_radius_in_miles', integer() }
  | {'name', binary() }
  | {'optimization_goal_metadata', openapi_nullable_optimization_goal_metadata:openapi_nullable_optimization_goal_metadata() }
  | {'performance_plus_campaign_settings', openapi_performance_plus_campaign_settings:openapi_performance_plus_campaign_settings() }
  | {'placement_group', openapi_placement_group_type:openapi_placement_group_type() }
  | {'placement_traffic_type', openapi_placement_traffic_type:openapi_placement_traffic_type() }
  | {'promotion_application_level', openapi_promotion_application_level:openapi_promotion_application_level() }
  | {'promotion_id', binary() }
  | {'promotion_ids', list(binary()) }
  | {'start_time', integer() }
  | {'status', openapi_entity_status:openapi_entity_status() }
  | {'summary_status', openapi_summary_status:openapi_summary_status() }
  | {'targeting_spec', openapi_targeting_spec_optimal:openapi_targeting_spec_optimal() }
  | {'targeting_template_ids', list(binary()) }
  | {'tracking_urls', openapi_ad_group_tracking_urls:openapi_ad_group_tracking_urls() }
  | {'type', binary() }
  | {'updated_time', integer() }
  | {'auto_targeting_enabled', boolean() }
  | {'bid_multiplier', integer() }
  | {'budget_type', openapi_budget_type:openapi_budget_type() }
  | {'pacing_delivery_type', openapi_pacing_delivery_type:openapi_pacing_delivery_type() }
  ].


openapi_ad_group_update() ->
    openapi_ad_group_update([]).

openapi_ad_group_update(Fields) ->
  Default = [ {'ad_account_id', binary() }
            , {'bid_in_micro_currency', integer() }
            , {'bid_strategy_type', openapi_bid_strategy_type:openapi_bid_strategy_type() }
            , {'billable_event', openapi_action_type:openapi_action_type() }
            , {'budget_in_micro_currency', integer() }
            , {'campaign_id', binary() }
            , {'conversion_learning_mode_type', openapi_conversion_learning_mode_type:openapi_conversion_learning_mode_type() }
            , {'created_time', integer() }
            , {'customer_segment_id', binary() }
            , {'dca_assets', openapi_any_type:openapi_any_type() }
            , {'end_time', integer() }
            , {'ext_features', openapi_adgroup_tracking_features:openapi_adgroup_tracking_features() }
            , {'feed_profile_id', binary() }
            , {'id', binary() }
            , {'is_creative_optimization', boolean() }
            , {'is_local_inventory', boolean() }
            , {'lifetime_frequency_cap', integer() }
            , {'local_inventory_radius_in_miles', integer() }
            , {'name', binary() }
            , {'optimization_goal_metadata', openapi_nullable_optimization_goal_metadata:openapi_nullable_optimization_goal_metadata() }
            , {'performance_plus_campaign_settings', openapi_performance_plus_campaign_settings:openapi_performance_plus_campaign_settings() }
            , {'placement_group', openapi_placement_group_type:openapi_placement_group_type() }
            , {'placement_traffic_type', openapi_placement_traffic_type:openapi_placement_traffic_type() }
            , {'promotion_application_level', openapi_promotion_application_level:openapi_promotion_application_level() }
            , {'promotion_id', binary() }
            , {'promotion_ids', list(binary()) }
            , {'start_time', integer() }
            , {'status', openapi_entity_status:openapi_entity_status() }
            , {'summary_status', openapi_summary_status:openapi_summary_status() }
            , {'targeting_spec', openapi_targeting_spec_optimal:openapi_targeting_spec_optimal() }
            , {'targeting_template_ids', list(binary()) }
            , {'tracking_urls', openapi_ad_group_tracking_urls:openapi_ad_group_tracking_urls() }
            , {'type', binary() }
            , {'updated_time', integer() }
            , {'auto_targeting_enabled', boolean() }
            , {'bid_multiplier', integer() }
            , {'budget_type', openapi_budget_type:openapi_budget_type() }
            , {'pacing_delivery_type', openapi_pacing_delivery_type:openapi_pacing_delivery_type() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

