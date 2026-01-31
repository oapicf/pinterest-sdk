-module(openapi_product_category_region).

-include("openapi.hrl").

-export([openapi_product_category_region/0]).

-export_type([openapi_product_category_region/0]).

-type openapi_product_category_region() ::
  binary().

openapi_product_category_region() ->
  elements([<<"US">>, <<"GB+IE">>, <<"CA">>]).

