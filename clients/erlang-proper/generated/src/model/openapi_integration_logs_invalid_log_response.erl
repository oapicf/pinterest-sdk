-module(openapi_integration_logs_invalid_log_response).

-include("openapi.hrl").

-export([openapi_integration_logs_invalid_log_response/0]).

-export([openapi_integration_logs_invalid_log_response/1]).

-export_type([openapi_integration_logs_invalid_log_response/0]).

-type openapi_integration_logs_invalid_log_response() ::
  [ {'rejected_logs', list(openapi_integration_logs_invalid_log_response_rejected_logs_inner:openapi_integration_logs_invalid_log_response_rejected_logs_inner()) }
  ].


openapi_integration_logs_invalid_log_response() ->
    openapi_integration_logs_invalid_log_response([]).

openapi_integration_logs_invalid_log_response(Fields) ->
  Default = [ {'rejected_logs', list(openapi_integration_logs_invalid_log_response_rejected_logs_inner:openapi_integration_logs_invalid_log_response_rejected_logs_inner()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

