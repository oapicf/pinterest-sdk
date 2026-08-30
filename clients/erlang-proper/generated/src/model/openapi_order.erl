-module(openapi_order).

-include("openapi.hrl").

-export([openapi_order/0]).

-export_type([openapi_order/0]).

-type openapi_order() ::
  binary().

openapi_order() ->
  elements([<<"ASCENDING">>, <<"DESCENDING">>]).

