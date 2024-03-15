-module(openapi_campaign_create_common).

-include("openapi.hrl").

-export([openapi_campaign_create_common/0]).

-export([openapi_campaign_create_common/1]).

-export_type([openapi_campaign_create_common/0]).

-type openapi_campaign_create_common() ::
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
  ].


openapi_campaign_create_common() ->
    openapi_campaign_create_common([]).

openapi_campaign_create_common(Fields) ->
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
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

