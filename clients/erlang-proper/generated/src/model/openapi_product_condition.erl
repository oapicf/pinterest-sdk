-module(openapi_product_condition).

-include("openapi.hrl").

-export([openapi_product_condition/0]).

-export_type([openapi_product_condition/0]).

-type openapi_product_condition() ::
  binary().

openapi_product_condition() ->
  elements([<<"NEW">>, <<"USED">>, <<"REFURBISHED">>]).

