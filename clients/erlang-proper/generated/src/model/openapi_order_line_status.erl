-module(openapi_order_line_status).

-include("openapi.hrl").

-export([openapi_order_line_status/0]).

-export_type([openapi_order_line_status/0]).

-type openapi_order_line_status() ::
  binary().

openapi_order_line_status() ->
  elements([<<"ACTIVE">>, <<"PAUSED">>, <<"DELETED">>]).

