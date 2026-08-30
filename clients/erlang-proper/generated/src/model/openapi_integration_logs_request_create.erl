-module(openapi_integration_logs_request_create).

-include("openapi.hrl").

-export([openapi_integration_logs_request_create/0]).

-export([openapi_integration_logs_request_create/1]).

-export_type([openapi_integration_logs_request_create/0]).

-type openapi_integration_logs_request_create() ::
  [ {'logs', list(openapi_integration_log:openapi_integration_log()) }
  ].


openapi_integration_logs_request_create() ->
    openapi_integration_logs_request_create([]).

openapi_integration_logs_request_create(Fields) ->
  Default = [ {'logs', list(openapi_integration_log:openapi_integration_log(), 1, 250) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

