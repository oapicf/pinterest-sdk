-module(openapi_audience_create_request).

-include("openapi.hrl").

-export([openapi_audience_create_request/0]).

-export([openapi_audience_create_request/1]).

-export_type([openapi_audience_create_request/0]).

-type openapi_audience_create_request() ::
  [ {'ad_account_id', binary() }
  | {'name', binary() }
  | {'rule', openapi_audience_rule:openapi_audience_rule() }
  | {'description', binary() }
  | {'audience_type', openapi_audience_create_request_1_audience_type:openapi_audience_create_request_1_audience_type() }
  ].


openapi_audience_create_request() ->
    openapi_audience_create_request([]).

openapi_audience_create_request(Fields) ->
  Default = [ {'ad_account_id', binary() }
            , {'name', binary() }
            , {'rule', openapi_audience_rule:openapi_audience_rule() }
            , {'description', binary() }
            , {'audience_type', openapi_audience_create_request_1_audience_type:openapi_audience_create_request_1_audience_type() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

