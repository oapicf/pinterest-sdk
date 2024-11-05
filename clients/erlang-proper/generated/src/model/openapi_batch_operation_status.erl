-module(openapi_batch_operation_status).

-include("openapi.hrl").

-export([openapi_batch_operation_status/0]).

-export_type([openapi_batch_operation_status/0]).

-type openapi_batch_operation_status() ::
  binary().

openapi_batch_operation_status() ->
  elements([<<"PROCESSING">>, <<"COMPLETED">>, <<"FAILED">>]).

