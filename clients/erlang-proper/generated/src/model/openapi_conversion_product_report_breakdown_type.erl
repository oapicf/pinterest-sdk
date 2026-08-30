-module(openapi_conversion_product_report_breakdown_type).

-include("openapi.hrl").

-export([openapi_conversion_product_report_breakdown_type/0]).

-export_type([openapi_conversion_product_report_breakdown_type/0]).

-type openapi_conversion_product_report_breakdown_type() ::
  binary().

openapi_conversion_product_report_breakdown_type() ->
  elements([<<"PRODUCT_BRAND">>, <<"PRODUCT_CATEGORY">>, <<"PRODUCT_BRAND_AND_CATEGORY">>, <<"PRODUCT_SKU">>, <<"PRODUCT_SKU_GROUP">>]).

