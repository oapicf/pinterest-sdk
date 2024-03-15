-module(openapi_integration_logs_success_response).

-include("openapi.hrl").

-export([openapi_integration_logs_success_response/0]).

-export([openapi_integration_logs_success_response/1]).

-export_type([openapi_integration_logs_success_response/0]).

-type openapi_integration_logs_success_response() ::
  [ {'message', binary() }
  ].


openapi_integration_logs_success_response() ->
    openapi_integration_logs_success_response([]).

openapi_integration_logs_success_response(Fields) ->
  Default = [ {'message', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

