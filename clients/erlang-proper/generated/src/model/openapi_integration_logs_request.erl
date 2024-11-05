-module(openapi_integration_logs_request).

-include("openapi.hrl").

-export([openapi_integration_logs_request/0]).

-export([openapi_integration_logs_request/1]).

-export_type([openapi_integration_logs_request/0]).

-type openapi_integration_logs_request() ::
  [ {'logs', list(openapi_integration_log:openapi_integration_log()) }
  ].


openapi_integration_logs_request() ->
    openapi_integration_logs_request([]).

openapi_integration_logs_request(Fields) ->
  Default = [ {'logs', list(openapi_integration_log:openapi_integration_log(), 1, 250) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

