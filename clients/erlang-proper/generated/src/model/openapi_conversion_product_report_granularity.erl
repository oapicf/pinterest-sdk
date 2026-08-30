-module(openapi_conversion_product_report_granularity).

-include("openapi.hrl").

-export([openapi_conversion_product_report_granularity/0]).

-export_type([openapi_conversion_product_report_granularity/0]).

-type openapi_conversion_product_report_granularity() ::
  binary().

openapi_conversion_product_report_granularity() ->
  elements([<<"TOTAL">>, <<"WEEK">>, <<"MONTH">>]).

