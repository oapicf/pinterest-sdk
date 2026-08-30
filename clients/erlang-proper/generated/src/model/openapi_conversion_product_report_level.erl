-module(openapi_conversion_product_report_level).

-include("openapi.hrl").

-export([openapi_conversion_product_report_level/0]).

-export_type([openapi_conversion_product_report_level/0]).

-type openapi_conversion_product_report_level() ::
  binary().

openapi_conversion_product_report_level() ->
  elements([<<"ADVERTISER">>, <<"CAMPAIGN">>, <<"AD_GROUP">>]).

