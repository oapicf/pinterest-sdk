-module(openapi_integration_logs_invalid_log_response_rejected_logs_items).

-include("openapi.hrl").

-export([openapi_integration_logs_invalid_log_response_rejected_logs_items/0]).

-export([openapi_integration_logs_invalid_log_response_rejected_logs_items/1]).

-export_type([openapi_integration_logs_invalid_log_response_rejected_logs_items/0]).

-type openapi_integration_logs_invalid_log_response_rejected_logs_items() ::
  [ {'field', binary() }
  | {'log_index', integer() }
  | {'reason', binary() }
  | {'value', binary() }
  ].


openapi_integration_logs_invalid_log_response_rejected_logs_items() ->
    openapi_integration_logs_invalid_log_response_rejected_logs_items([]).

openapi_integration_logs_invalid_log_response_rejected_logs_items(Fields) ->
  Default = [ {'field', binary() }
            , {'log_index', integer() }
            , {'reason', binary() }
            , {'value', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

