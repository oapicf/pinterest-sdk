-module(openapi_campaign_create_common).

-include("openapi.hrl").

-export([openapi_campaign_create_common/0]).

-export([openapi_campaign_create_common/1]).

-export_type([openapi_campaign_create_common/0]).

-type openapi_campaign_create_common() ::
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
  ].


openapi_campaign_create_common() ->
    openapi_campaign_create_common([]).

openapi_campaign_create_common(Fields) ->
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
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

