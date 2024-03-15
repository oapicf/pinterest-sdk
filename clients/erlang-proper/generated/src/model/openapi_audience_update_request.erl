-module(openapi_audience_update_request).

-include("openapi.hrl").

-export([openapi_audience_update_request/0]).

-export([openapi_audience_update_request/1]).

-export_type([openapi_audience_update_request/0]).

-type openapi_audience_update_request() ::
  [ {'ad_account_id', binary() }
  | {'name', binary() }
  | {'rule', openapi_audience_rule:openapi_audience_rule() }
  | {'description', binary() }
  | {'operation_type', openapi_audience_update_operation_type:openapi_audience_update_operation_type() }
  ].


openapi_audience_update_request() ->
    openapi_audience_update_request([]).

openapi_audience_update_request(Fields) ->
  Default = [ {'ad_account_id', binary() }
            , {'name', binary() }
            , {'rule', openapi_audience_rule:openapi_audience_rule() }
            , {'description', binary() }
            , {'operation_type', openapi_audience_update_operation_type:openapi_audience_update_operation_type() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

