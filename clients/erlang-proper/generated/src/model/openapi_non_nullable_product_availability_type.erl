-module(openapi_non_nullable_product_availability_type).

-include("openapi.hrl").

-export([openapi_non_nullable_product_availability_type/0]).

-export_type([openapi_non_nullable_product_availability_type/0]).

-type openapi_non_nullable_product_availability_type() ::
  binary().

openapi_non_nullable_product_availability_type() ->
  elements([<<"IN_STOCK">>, <<"OUT_OF_STOCK">>, <<"PREORDER">>]).

