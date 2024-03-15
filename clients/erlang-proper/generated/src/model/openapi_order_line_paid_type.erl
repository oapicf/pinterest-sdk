-module(openapi_order_line_paid_type).

-include("openapi.hrl").

-export([openapi_order_line_paid_type/0]).

-export_type([openapi_order_line_paid_type/0]).

-type openapi_order_line_paid_type() ::
  binary().

openapi_order_line_paid_type() ->
  elements([<<"PAID">>, <<"BONUS">>, <<"MAKE_GOOD">>, <<"TEST">>, <<"">>]).

