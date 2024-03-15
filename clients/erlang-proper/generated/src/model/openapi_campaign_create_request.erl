-module(openapi_campaign_create_request).

-include("openapi.hrl").

-export([openapi_campaign_create_request/0]).

-export([openapi_campaign_create_request/1]).

-export_type([openapi_campaign_create_request/0]).

-type openapi_campaign_create_request() ::
  [ {'ad_account_id', binary() }
  | {'name', binary() }
  | {'status', openapi_entity_status:openapi_entity_status() }
  | {'lifetime_spend_cap', integer() }
  | {'daily_spend_cap', integer() }
  | {'order_line_id', binary() }
  | {'tracking_urls', openapi_ad_common_tracking_urls:openapi_ad_common_tracking_urls() }
  | {'start_time', integer() }
  | {'end_time', integer() }
  | {'summary_status', openapi_campaign_summary_status:openapi_campaign_summary_status() }
  | {'is_flexible_daily_budgets', boolean() }
  | {'default_ad_group_budget_in_micro_currency', integer() }
  | {'is_automated_campaign', boolean() }
  | {'objective_type', openapi_objective_type:openapi_objective_type() }
  ].


openapi_campaign_create_request() ->
    openapi_campaign_create_request([]).

openapi_campaign_create_request(Fields) ->
  Default = [ {'ad_account_id', binary() }
            , {'name', binary() }
            , {'status', openapi_entity_status:openapi_entity_status() }
            , {'lifetime_spend_cap', integer() }
            , {'daily_spend_cap', integer() }
            , {'order_line_id', binary() }
            , {'tracking_urls', openapi_ad_common_tracking_urls:openapi_ad_common_tracking_urls() }
            , {'start_time', integer() }
            , {'end_time', integer() }
            , {'summary_status', openapi_campaign_summary_status:openapi_campaign_summary_status() }
            , {'is_flexible_daily_budgets', boolean() }
            , {'default_ad_group_budget_in_micro_currency', integer() }
            , {'is_automated_campaign', boolean() }
            , {'objective_type', openapi_objective_type:openapi_objective_type() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

