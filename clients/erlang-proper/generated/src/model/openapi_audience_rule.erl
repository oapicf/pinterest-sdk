-module(openapi_audience_rule).

-include("openapi.hrl").

-export([openapi_audience_rule/0]).

-export([openapi_audience_rule/1]).

-export_type([openapi_audience_rule/0]).

-type openapi_audience_rule() ::
  [ {'country', binary() }
  | {'customer_list_id', binary() }
  | {'engagement_domain', list(binary()) }
  | {'engagement_type', binary() }
  | {'event', binary() }
  | {'event_data', openapi_pinterest_tag_event_data:openapi_pinterest_tag_event_data() }
  | {'percentage', integer() }
  | {'pin_id', list(binary()) }
  | {'prefill', boolean() }
  | {'retention_days', integer() }
  | {'seed_id', list(binary()) }
  | {'url', list(binary()) }
  | {'visitor_source_id', binary() }
  | {'event_source', map() }
  | {'ingestion_source', map() }
  | {'engager_type', integer() }
  | {'campaign_id', list(binary()) }
  | {'ad_id', list(binary()) }
  | {'objective_type', list(openapi_objective_type:openapi_objective_type()) }
  | {'ad_account_id', binary() }
  ].


openapi_audience_rule() ->
    openapi_audience_rule([]).

openapi_audience_rule(Fields) ->
  Default = [ {'country', binary() }
            , {'customer_list_id', binary() }
            , {'engagement_domain', list(binary()) }
            , {'engagement_type', binary() }
            , {'event', binary() }
            , {'event_data', openapi_pinterest_tag_event_data:openapi_pinterest_tag_event_data() }
            , {'percentage', integer() }
            , {'pin_id', list(binary()) }
            , {'prefill', boolean() }
            , {'retention_days', integer() }
            , {'seed_id', list(binary()) }
            , {'url', list(binary()) }
            , {'visitor_source_id', binary() }
            , {'event_source', map() }
            , {'ingestion_source', map() }
            , {'engager_type', integer() }
            , {'campaign_id', list(binary()) }
            , {'ad_id', list(binary()) }
            , {'objective_type', list(openapi_objective_type:openapi_objective_type()) }
            , {'ad_account_id', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

