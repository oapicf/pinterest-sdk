-module(openapi_ad_group_common).

-include("openapi.hrl").

-export([openapi_ad_group_common/0]).

-export([openapi_ad_group_common/1]).

-export_type([openapi_ad_group_common/0]).

-type openapi_ad_group_common() ::
  [ {'name', binary() }
  | {'status', openapi_entity_status:openapi_entity_status() }
  | {'budget_in_micro_currency', integer() }
  | {'bid_in_micro_currency', integer() }
  | {'optimization_goal_metadata', openapi_ad_group_common_optimization_goal_metadata:openapi_ad_group_common_optimization_goal_metadata() }
  | {'budget_type', openapi_budget_type:openapi_budget_type() }
  | {'start_time', integer() }
  | {'end_time', integer() }
  | {'targeting_spec', openapi_targeting_spec:openapi_targeting_spec() }
  | {'lifetime_frequency_cap', integer() }
  | {'tracking_urls', openapi_ad_group_common_tracking_urls:openapi_ad_group_common_tracking_urls() }
  | {'auto_targeting_enabled', boolean() }
  | {'placement_group', openapi_placement_group_type:openapi_placement_group_type() }
  | {'pacing_delivery_type', openapi_pacing_delivery_type:openapi_pacing_delivery_type() }
  | {'campaign_id', binary() }
  | {'billable_event', openapi_action_type:openapi_action_type() }
  | {'bid_strategy_type', binary() }
  ].


openapi_ad_group_common() ->
    openapi_ad_group_common([]).

openapi_ad_group_common(Fields) ->
  Default = [ {'name', binary() }
            , {'status', openapi_entity_status:openapi_entity_status() }
            , {'budget_in_micro_currency', integer() }
            , {'bid_in_micro_currency', integer() }
            , {'optimization_goal_metadata', openapi_ad_group_common_optimization_goal_metadata:openapi_ad_group_common_optimization_goal_metadata() }
            , {'budget_type', openapi_budget_type:openapi_budget_type() }
            , {'start_time', integer() }
            , {'end_time', integer() }
            , {'targeting_spec', openapi_targeting_spec:openapi_targeting_spec() }
            , {'lifetime_frequency_cap', integer() }
            , {'tracking_urls', openapi_ad_group_common_tracking_urls:openapi_ad_group_common_tracking_urls() }
            , {'auto_targeting_enabled', boolean() }
            , {'placement_group', openapi_placement_group_type:openapi_placement_group_type() }
            , {'pacing_delivery_type', openapi_pacing_delivery_type:openapi_pacing_delivery_type() }
            , {'campaign_id', binary() }
            , {'billable_event', openapi_action_type:openapi_action_type() }
            , {'bid_strategy_type', elements([<<"AUTOMATIC_BID">>, <<"MAX_BID">>, <<"TARGET_AVG">>, <<"">>]) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

