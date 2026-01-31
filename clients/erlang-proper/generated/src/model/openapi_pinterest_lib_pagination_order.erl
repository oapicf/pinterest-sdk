-module(openapi_pinterest_lib_pagination_order).

-include("openapi.hrl").

-export([openapi_pinterest_lib_pagination_order/0]).

-export_type([openapi_pinterest_lib_pagination_order/0]).

-type openapi_pinterest_lib_pagination_order() ::
  binary().

openapi_pinterest_lib_pagination_order() ->
  elements([<<"ASCENDING">>, <<"DESCENDING">>]).

