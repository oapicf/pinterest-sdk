-module(openapi_audience_update_operation_type).

-include("openapi.hrl").

-export([openapi_audience_update_operation_type/0]).

-export_type([openapi_audience_update_operation_type/0]).

-type openapi_audience_update_operation_type() ::
  binary().

openapi_audience_update_operation_type() ->
  elements([<<"UPDATE">>, <<"REMOVE">>]).

