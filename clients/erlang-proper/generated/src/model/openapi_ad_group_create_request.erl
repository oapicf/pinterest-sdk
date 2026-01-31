-module(openapi_ad_group_create_request).

-include("openapi.hrl").

-export([openapi_ad_group_create_request/0]).

-export([openapi_ad_group_create_request/1]).

-export_type([openapi_ad_group_create_request/0]).

-type openapi_ad_group_create_request() ::
  [ {'auto_targeting_enabled', boolean() }
  | {'bid_in_micro_currency', integer() }
  | {'bid_strategy_type', binary() }
  | {'billable_event', openapi_action_type:openapi_action_type() }
  | {'budget_in_micro_currency', integer() }
  | {'budget_type', openapi_budget_type:openapi_budget_type() }
  | {'campaign_id', binary() }
  | {'end_time', integer() }
  | {'is_creative_optimization', boolean() }
  | {'lifetime_frequency_cap', integer() }
  | {'name', binary() }
  | {'optimization_goal_metadata', openapi_optimization_goal_metadata:openapi_optimization_goal_metadata() }
  | {'pacing_delivery_type', openapi_pacing_delivery_type:openapi_pacing_delivery_type() }
  | {'placement_group', openapi_placement_group_type:openapi_placement_group_type() }
  | {'promotion_application_level', binary() }
  | {'promotion_id', binary() }
  | {'start_time', integer() }
  | {'status', openapi_entity_status:openapi_entity_status() }
  | {'targeting_spec', openapi_targeting_spec:openapi_targeting_spec() }
  | {'targeting_template_ids', list(binary()) }
  | {'tracking_urls', openapi_tracking_urls:openapi_tracking_urls() }
  | {'bid_multiplier', integer() }
  ].


openapi_ad_group_create_request() ->
    openapi_ad_group_create_request([]).

openapi_ad_group_create_request(Fields) ->
  Default = [ {'auto_targeting_enabled', boolean() }
            , {'bid_in_micro_currency', integer() }
            , {'bid_strategy_type', elements([<<"AUTOMATIC_BID">>, <<"MAX_BID">>, <<"TARGET_AVG">>, <<"">>]) }
            , {'billable_event', openapi_action_type:openapi_action_type() }
            , {'budget_in_micro_currency', integer() }
            , {'budget_type', openapi_budget_type:openapi_budget_type() }
            , {'campaign_id', binary() }
            , {'end_time', integer() }
            , {'is_creative_optimization', boolean() }
            , {'lifetime_frequency_cap', integer() }
            , {'name', binary() }
            , {'optimization_goal_metadata', openapi_optimization_goal_metadata:openapi_optimization_goal_metadata() }
            , {'pacing_delivery_type', openapi_pacing_delivery_type:openapi_pacing_delivery_type() }
            , {'placement_group', openapi_placement_group_type:openapi_placement_group_type() }
            , {'promotion_application_level', elements([<<"NONE">>, <<"ITEM">>, <<"AD_GROUP">>, <<"">>]) }
            , {'promotion_id', binary() }
            , {'start_time', integer() }
            , {'status', openapi_entity_status:openapi_entity_status() }
            , {'targeting_spec', openapi_targeting_spec:openapi_targeting_spec() }
            , {'targeting_template_ids', list(binary()) }
            , {'tracking_urls', openapi_tracking_urls:openapi_tracking_urls() }
            , {'bid_multiplier', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

