-module(openapi_product_availability).

-include("openapi.hrl").

-export([openapi_product_availability/0]).

-export_type([openapi_product_availability/0]).

-type openapi_product_availability() ::
  binary().

openapi_product_availability() ->
  elements([<<"IN_STOCK">>, <<"OUT_OF_STOCK">>, <<"PREORDER">>]).

