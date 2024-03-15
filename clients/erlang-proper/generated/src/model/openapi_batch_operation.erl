-module(openapi_batch_operation).

-include("openapi.hrl").

-export([openapi_batch_operation/0]).

-export_type([openapi_batch_operation/0]).

-type openapi_batch_operation() ::
  binary().

openapi_batch_operation() ->
  elements([<<"UPDATE">>, <<"UPSERT">>, <<"CREATE">>, <<"DELETE_DISCONTINUED">>, <<"DELETE">>]).

