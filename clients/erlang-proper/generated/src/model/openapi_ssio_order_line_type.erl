-module(openapi_ssio_order_line_type).

-include("openapi.hrl").

-export([openapi_ssio_order_line_type/0]).

-export_type([openapi_ssio_order_line_type/0]).

-type openapi_ssio_order_line_type() ::
  binary().

openapi_ssio_order_line_type() ->
  elements([<<"BUDGET">>, <<"PERPETUALS">>]).

