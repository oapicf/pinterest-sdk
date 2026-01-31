-module(openapi_campaign_create_request).

-include("openapi.hrl").

-export([openapi_campaign_create_request/0]).

-export([openapi_campaign_create_request/1]).

-export_type([openapi_campaign_create_request/0]).

-type openapi_campaign_create_request() ::
  [ {'ad_account_id', binary() }
  | {'daily_spend_cap', integer() }
  | {'end_time', integer() }
  | {'is_automated_campaign', boolean() }
  | {'is_flexible_daily_budgets', boolean() }
  | {'lifetime_spend_cap', integer() }
  | {'name', binary() }
  | {'order_line_id', binary() }
  | {'start_time', integer() }
  | {'status', openapi_entity_status:openapi_entity_status() }
  | {'tracking_urls', openapi_tracking_urls:openapi_tracking_urls() }
  | {'default_ad_group_budget_in_micro_currency', integer() }
  | {'is_campaign_budget_optimization', boolean() }
  | {'bid_options', openapi_campaign_bid_options_create:openapi_campaign_bid_options_create() }
  | {'is_performance_plus', boolean() }
  | {'objective_type', openapi_objective_type:openapi_objective_type() }
  ].


openapi_campaign_create_request() ->
    openapi_campaign_create_request([]).

openapi_campaign_create_request(Fields) ->
  Default = [ {'ad_account_id', binary() }
            , {'daily_spend_cap', integer() }
            , {'end_time', integer() }
            , {'is_automated_campaign', boolean() }
            , {'is_flexible_daily_budgets', boolean() }
            , {'lifetime_spend_cap', integer() }
            , {'name', binary() }
            , {'order_line_id', binary() }
            , {'start_time', integer() }
            , {'status', openapi_entity_status:openapi_entity_status() }
            , {'tracking_urls', openapi_tracking_urls:openapi_tracking_urls() }
            , {'default_ad_group_budget_in_micro_currency', integer() }
            , {'is_campaign_budget_optimization', boolean() }
            , {'bid_options', openapi_campaign_bid_options_create:openapi_campaign_bid_options_create() }
            , {'is_performance_plus', boolean() }
            , {'objective_type', openapi_objective_type:openapi_objective_type() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

