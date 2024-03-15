-module(openapi_campaign_response).

-include("openapi.hrl").

-export([openapi_campaign_response/0]).

-export([openapi_campaign_response/1]).

-export_type([openapi_campaign_response/0]).

-type openapi_campaign_response() ::
  [ {'id', binary() }
  | {'ad_account_id', binary() }
  | {'name', binary() }
  | {'status', openapi_entity_status:openapi_entity_status() }
  | {'lifetime_spend_cap', integer() }
  | {'daily_spend_cap', integer() }
  | {'order_line_id', binary() }
  | {'tracking_urls', openapi_ad_common_tracking_urls:openapi_ad_common_tracking_urls() }
  | {'start_time', integer() }
  | {'end_time', integer() }
  | {'summary_status', openapi_campaign_summary_status:openapi_campaign_summary_status() }
  | {'objective_type', openapi_objective_type:openapi_objective_type() }
  | {'created_time', integer() }
  | {'updated_time', integer() }
  | {'type', binary() }
  | {'is_flexible_daily_budgets', boolean() }
  | {'is_campaign_budget_optimization', boolean() }
  ].


openapi_campaign_response() ->
    openapi_campaign_response([]).

openapi_campaign_response(Fields) ->
  Default = [ {'id', binary() }
            , {'ad_account_id', binary() }
            , {'name', binary() }
            , {'status', openapi_entity_status:openapi_entity_status() }
            , {'lifetime_spend_cap', integer() }
            , {'daily_spend_cap', integer() }
            , {'order_line_id', binary() }
            , {'tracking_urls', openapi_ad_common_tracking_urls:openapi_ad_common_tracking_urls() }
            , {'start_time', integer() }
            , {'end_time', integer() }
            , {'summary_status', openapi_campaign_summary_status:openapi_campaign_summary_status() }
            , {'objective_type', openapi_objective_type:openapi_objective_type() }
            , {'created_time', integer() }
            , {'updated_time', integer() }
            , {'type', binary() }
            , {'is_flexible_daily_budgets', boolean() }
            , {'is_campaign_budget_optimization', boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

