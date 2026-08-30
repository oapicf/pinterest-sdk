-module(openapi_audience).

-include("openapi.hrl").

-export([openapi_audience/0]).

-export([openapi_audience/1]).

-export_type([openapi_audience/0]).

-type openapi_audience() ::
  [ {'ad_account_id', binary() }
  | {'audience_type', openapi_pinner_list_type:openapi_pinner_list_type() }
  | {'created_by_company_name', binary() }
  | {'created_timestamp', integer() }
  | {'description', binary() }
  | {'id', binary() }
  | {'is_nca', boolean() }
  | {'name', binary() }
  | {'rule', openapi_audience_rule:openapi_audience_rule() }
  | {'size', integer() }
  | {'status', openapi_audience_status:openapi_audience_status() }
  | {'type', binary() }
  | {'updated_timestamp', integer() }
  ].


openapi_audience() ->
    openapi_audience([]).

openapi_audience(Fields) ->
  Default = [ {'ad_account_id', binary() }
            , {'audience_type', openapi_pinner_list_type:openapi_pinner_list_type() }
            , {'created_by_company_name', binary() }
            , {'created_timestamp', integer() }
            , {'description', binary() }
            , {'id', binary() }
            , {'is_nca', boolean() }
            , {'name', binary() }
            , {'rule', openapi_audience_rule:openapi_audience_rule() }
            , {'size', integer() }
            , {'status', openapi_audience_status:openapi_audience_status() }
            , {'type', binary() }
            , {'updated_timestamp', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

