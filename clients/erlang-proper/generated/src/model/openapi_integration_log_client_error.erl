-module(openapi_integration_log_client_error).

-include("openapi.hrl").

-export([openapi_integration_log_client_error/0]).

-export([openapi_integration_log_client_error/1]).

-export_type([openapi_integration_log_client_error/0]).

-type openapi_integration_log_client_error() ::
  [ {'cause', binary() }
  | {'column_number', integer() }
  | {'file_name', binary() }
  | {'line_number', integer() }
  | {'message', binary() }
  | {'message_detail', binary() }
  | {'name', binary() }
  | {'number', integer() }
  | {'stack_trace', binary() }
  ].


openapi_integration_log_client_error() ->
    openapi_integration_log_client_error([]).

openapi_integration_log_client_error(Fields) ->
  Default = [ {'cause', binary() }
            , {'column_number', integer() }
            , {'file_name', binary() }
            , {'line_number', integer() }
            , {'message', binary() }
            , {'message_detail', binary() }
            , {'name', binary() }
            , {'number', integer() }
            , {'stack_trace', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

