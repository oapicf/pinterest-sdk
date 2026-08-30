-module(openapi_ad_group_create_create).

-include("openapi.hrl").

-export([openapi_ad_group_create_create/0]).

-export([openapi_ad_group_create_create/1]).

-export_type([openapi_ad_group_create_create/0]).

-type openapi_ad_group_create_create() ::
  [ {'auto_targeting_enabled', boolean() }
  | {'bid_in_micro_currency', integer() }
  | {'bid_multiplier', integer() }
  | {'bid_strategy_type', openapi_bid_strategy_type:openapi_bid_strategy_type() }
  | {'billable_event', openapi_action_type:openapi_action_type() }
  | {'budget_in_micro_currency', integer() }
  | {'budget_type', openapi_budget_type:openapi_budget_type() }
  | {'campaign_id', binary() }
  | {'customer_segment_id', binary() }
  | {'end_time', integer() }
  | {'ext_features', openapi_adgroup_tracking_features:openapi_adgroup_tracking_features() }
  | {'feed_profile_id', binary() }
  | {'is_creative_optimization', boolean() }
  | {'is_local_inventory', boolean() }
  | {'lifetime_frequency_cap', integer() }
  | {'local_inventory_radius_in_miles', integer() }
  | {'name', binary() }
  | {'optimization_goal_metadata', openapi_nullable_optimization_goal_metadata:openapi_nullable_optimization_goal_metadata() }
  | {'pacing_delivery_type', openapi_pacing_delivery_type:openapi_pacing_delivery_type() }
  | {'performance_plus_campaign_settings', openapi_performance_plus_campaign_settings:openapi_performance_plus_campaign_settings() }
  | {'placement_group', openapi_placement_group_type:openapi_placement_group_type() }
  | {'placement_traffic_type', openapi_placement_traffic_type:openapi_placement_traffic_type() }
  | {'promotion_application_level', openapi_promotion_application_level:openapi_promotion_application_level() }
  | {'promotion_id', binary() }
  | {'promotion_ids', list(binary()) }
  | {'start_time', integer() }
  | {'status', openapi_entity_status:openapi_entity_status() }
  | {'targeting_spec', openapi_targeting_spec_optimal:openapi_targeting_spec_optimal() }
  | {'targeting_template_ids', list(binary()) }
  | {'tracking_urls', openapi_ad_group_tracking_urls:openapi_ad_group_tracking_urls() }
  ].


openapi_ad_group_create_create() ->
    openapi_ad_group_create_create([]).

openapi_ad_group_create_create(Fields) ->
  Default = [ {'auto_targeting_enabled', boolean() }
            , {'bid_in_micro_currency', integer() }
            , {'bid_multiplier', integer() }
            , {'bid_strategy_type', openapi_bid_strategy_type:openapi_bid_strategy_type() }
            , {'billable_event', openapi_action_type:openapi_action_type() }
            , {'budget_in_micro_currency', integer() }
            , {'budget_type', openapi_budget_type:openapi_budget_type() }
            , {'campaign_id', binary() }
            , {'customer_segment_id', binary() }
            , {'end_time', integer() }
            , {'ext_features', openapi_adgroup_tracking_features:openapi_adgroup_tracking_features() }
            , {'feed_profile_id', binary() }
            , {'is_creative_optimization', boolean() }
            , {'is_local_inventory', boolean() }
            , {'lifetime_frequency_cap', integer() }
            , {'local_inventory_radius_in_miles', integer() }
            , {'name', binary() }
            , {'optimization_goal_metadata', openapi_nullable_optimization_goal_metadata:openapi_nullable_optimization_goal_metadata() }
            , {'pacing_delivery_type', openapi_pacing_delivery_type:openapi_pacing_delivery_type() }
            , {'performance_plus_campaign_settings', openapi_performance_plus_campaign_settings:openapi_performance_plus_campaign_settings() }
            , {'placement_group', openapi_placement_group_type:openapi_placement_group_type() }
            , {'placement_traffic_type', openapi_placement_traffic_type:openapi_placement_traffic_type() }
            , {'promotion_application_level', openapi_promotion_application_level:openapi_promotion_application_level() }
            , {'promotion_id', binary() }
            , {'promotion_ids', list(binary()) }
            , {'start_time', integer() }
            , {'status', openapi_entity_status:openapi_entity_status() }
            , {'targeting_spec', openapi_targeting_spec_optimal:openapi_targeting_spec_optimal() }
            , {'targeting_template_ids', list(binary()) }
            , {'tracking_urls', openapi_ad_group_tracking_urls:openapi_ad_group_tracking_urls() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

