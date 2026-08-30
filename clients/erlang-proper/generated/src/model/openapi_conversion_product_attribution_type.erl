-module(openapi_conversion_product_attribution_type).

-include("openapi.hrl").

-export([openapi_conversion_product_attribution_type/0]).

-export_type([openapi_conversion_product_attribution_type/0]).

-type openapi_conversion_product_attribution_type() ::
  binary().

openapi_conversion_product_attribution_type() ->
  elements([<<"DEFAULT">>, <<"BRAND_ATTRIBUTION">>]).

