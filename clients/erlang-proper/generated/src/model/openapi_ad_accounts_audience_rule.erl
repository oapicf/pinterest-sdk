-module(openapi_ad_accounts_audience_rule).

-include("openapi.hrl").

-export([openapi_ad_accounts_audience_rule/0]).

-export([openapi_ad_accounts_audience_rule/1]).

-export_type([openapi_ad_accounts_audience_rule/0]).

-type openapi_ad_accounts_audience_rule() ::
  [ {'ad_account_id', binary() }
  | {'ad_id', list(binary()) }
  | {'campaign_id', list(binary()) }
  | {'country', binary() }
  | {'customer_list_id', binary() }
  | {'engagement_domain', list(binary()) }
  | {'engagement_type', binary() }
  | {'engager_type', integer() }
  | {'event', binary() }
  | {'event_data', openapi_event_data:openapi_event_data() }
  | {'event_source', map() }
  | {'ingestion_source', map() }
  | {'objective_type', list(openapi_audience_objective_type:openapi_audience_objective_type()) }
  | {'percentage', integer() }
  | {'pin_id', list(binary()) }
  | {'prefill', boolean() }
  | {'retention_days', integer() }
  | {'seed_id', list(binary()) }
  | {'url', list(binary()) }
  | {'visitor_source_id', binary() }
  ].


openapi_ad_accounts_audience_rule() ->
    openapi_ad_accounts_audience_rule([]).

openapi_ad_accounts_audience_rule(Fields) ->
  Default = [ {'ad_account_id', binary() }
            , {'ad_id', list(binary()) }
            , {'campaign_id', list(binary()) }
            , {'country', binary() }
            , {'customer_list_id', binary() }
            , {'engagement_domain', list(binary()) }
            , {'engagement_type', binary() }
            , {'engager_type', integer() }
            , {'event', binary() }
            , {'event_data', openapi_event_data:openapi_event_data() }
            , {'event_source', map() }
            , {'ingestion_source', map() }
            , {'objective_type', list(openapi_audience_objective_type:openapi_audience_objective_type()) }
            , {'percentage', integer() }
            , {'pin_id', list(binary()) }
            , {'prefill', boolean() }
            , {'retention_days', integer() }
            , {'seed_id', list(binary()) }
            , {'url', list(binary()) }
            , {'visitor_source_id', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

