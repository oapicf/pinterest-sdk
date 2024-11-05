-module(openapi_operation_type).

-include("openapi.hrl").

-export([openapi_operation_type/0]).

-export_type([openapi_operation_type/0]).

-type openapi_operation_type() ::
  binary().

openapi_operation_type() ->
  elements([<<"SHARE">>, <<"REVOKE">>]).

