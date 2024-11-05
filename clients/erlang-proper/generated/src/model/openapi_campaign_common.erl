-module(openapi_campaign_common).

-include("openapi.hrl").

-export([openapi_campaign_common/0]).

-export([openapi_campaign_common/1]).

-export_type([openapi_campaign_common/0]).

-type openapi_campaign_common() ::
  [ {'ad_account_id', binary() }
  | {'name', binary() }
  | {'status', openapi_entity_status:openapi_entity_status() }
  | {'lifetime_spend_cap', integer() }
  | {'daily_spend_cap', integer() }
  | {'order_line_id', binary() }
  | {'tracking_urls', openapi_tracking_urls:openapi_tracking_urls() }
  | {'start_time', integer() }
  | {'end_time', integer() }
  | {'is_flexible_daily_budgets', boolean() }
  ].


openapi_campaign_common() ->
    openapi_campaign_common([]).

openapi_campaign_common(Fields) ->
  Default = [ {'ad_account_id', binary() }
            , {'name', binary() }
            , {'status', openapi_entity_status:openapi_entity_status() }
            , {'lifetime_spend_cap', integer() }
            , {'daily_spend_cap', integer() }
            , {'order_line_id', binary() }
            , {'tracking_urls', openapi_tracking_urls:openapi_tracking_urls() }
            , {'start_time', integer() }
            , {'end_time', integer() }
            , {'is_flexible_daily_budgets', boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

