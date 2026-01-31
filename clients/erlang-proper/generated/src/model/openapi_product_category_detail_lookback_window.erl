-module(openapi_product_category_detail_lookback_window).

-include("openapi.hrl").

-export([openapi_product_category_detail_lookback_window/0]).

-export_type([openapi_product_category_detail_lookback_window/0]).

-type openapi_product_category_detail_lookback_window() ::
  binary().

openapi_product_category_detail_lookback_window() ->
  elements([<<"90">>, <<"180">>, <<"365">>, <<"730">>]).

