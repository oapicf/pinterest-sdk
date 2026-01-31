-module(openapi_ad_group_response).

-include("openapi.hrl").

-export([openapi_ad_group_response/0]).

-export([openapi_ad_group_response/1]).

-export_type([openapi_ad_group_response/0]).

-type openapi_ad_group_response() ::
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
  | {'ad_account_id', binary() }
  | {'bid_multiplier', integer() }
  | {'conversion_learning_mode_type', binary() }
  | {'created_time', integer() }
  | {'dca_assets', openapi_any_type:openapi_any_type() }
  | {'feed_profile_id', binary() }
  | {'id', binary() }
  | {'summary_status', openapi_ad_group_summary_status:openapi_ad_group_summary_status() }
  | {'type', binary() }
  | {'updated_time', integer() }
  ].


openapi_ad_group_response() ->
    openapi_ad_group_response([]).

openapi_ad_group_response(Fields) ->
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
            , {'ad_account_id', binary() }
            , {'bid_multiplier', integer() }
            , {'conversion_learning_mode_type', elements([<<"NOT_ACTIVE">>, <<"ACTIVE">>, <<"">>]) }
            , {'created_time', integer() }
            , {'dca_assets', openapi_any_type:openapi_any_type() }
            , {'feed_profile_id', binary() }
            , {'id', binary() }
            , {'summary_status', openapi_ad_group_summary_status:openapi_ad_group_summary_status() }
            , {'type', binary() }
            , {'updated_time', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

