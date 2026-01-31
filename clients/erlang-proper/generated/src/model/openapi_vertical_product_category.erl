-module(openapi_vertical_product_category).

-include("openapi.hrl").

-export([openapi_vertical_product_category/0]).

-export_type([openapi_vertical_product_category/0]).

-type openapi_vertical_product_category() ::
  binary().

openapi_vertical_product_category() ->
  elements([<<"FASHION">>, <<"HOME_DECOR">>, <<"BEAUTY">>]).

