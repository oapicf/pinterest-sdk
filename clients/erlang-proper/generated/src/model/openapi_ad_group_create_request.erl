-module(openapi_ad_group_create_request).

-include("openapi.hrl").

-export([openapi_ad_group_create_request/0]).

-export([openapi_ad_group_create_request/1]).

-export_type([openapi_ad_group_create_request/0]).

-type openapi_ad_group_create_request() ::
  [ {'auto_targeting_enabled', boolean() }
  | {'bid_multiplier', integer() }
  | {'budget_type', openapi_budget_type:openapi_budget_type() }
  | {'pacing_delivery_type', openapi_pacing_delivery_type:openapi_pacing_delivery_type() }
  | {'bid_in_micro_currency', integer() }
  | {'bid_strategy_type', openapi_bid_strategy_type:openapi_bid_strategy_type() }
  | {'billable_event', openapi_action_type:openapi_action_type() }
  | {'budget_in_micro_currency', integer() }
  | {'campaign_id', binary() }
  | {'end_time', integer() }
  | {'is_creative_optimization', boolean() }
  | {'lifetime_frequency_cap', integer() }
  | {'name', binary() }
  | {'optimization_goal_metadata', map() }
  | {'placement_group', openapi_placement_group_type:openapi_placement_group_type() }
  | {'promotion_application_level', binary() }
  | {'promotion_id', binary() }
  | {'promotion_ids', list(binary()) }
  | {'start_time', integer() }
  | {'status', openapi_entity_status:openapi_entity_status() }
  | {'targeting_spec', openapi_targeting_spec:openapi_targeting_spec() }
  | {'targeting_template_ids', list(binary()) }
  | {'tracking_urls', map() }
  ].


openapi_ad_group_create_request() ->
    openapi_ad_group_create_request([]).

openapi_ad_group_create_request(Fields) ->
  Default = [ {'auto_targeting_enabled', boolean() }
            , {'bid_multiplier', integer() }
            , {'budget_type', openapi_budget_type:openapi_budget_type() }
            , {'pacing_delivery_type', openapi_pacing_delivery_type:openapi_pacing_delivery_type() }
            , {'bid_in_micro_currency', integer() }
            , {'bid_strategy_type', openapi_bid_strategy_type:openapi_bid_strategy_type() }
            , {'billable_event', openapi_action_type:openapi_action_type() }
            , {'budget_in_micro_currency', integer() }
            , {'campaign_id', binary() }
            , {'end_time', integer() }
            , {'is_creative_optimization', boolean() }
            , {'lifetime_frequency_cap', integer() }
            , {'name', binary() }
            , {'optimization_goal_metadata', map() }
            , {'placement_group', openapi_placement_group_type:openapi_placement_group_type() }
            , {'promotion_application_level', elements([<<"NONE">>, <<"ITEM">>, <<"AD_GROUP">>, <<"">>]) }
            , {'promotion_id', binary() }
            , {'promotion_ids', list(binary()) }
            , {'start_time', integer() }
            , {'status', openapi_entity_status:openapi_entity_status() }
            , {'targeting_spec', openapi_targeting_spec:openapi_targeting_spec() }
            , {'targeting_template_ids', list(binary()) }
            , {'tracking_urls', map() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

