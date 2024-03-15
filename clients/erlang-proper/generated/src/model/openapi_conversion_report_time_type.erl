-module(openapi_conversion_report_time_type).

-include("openapi.hrl").

-export([openapi_conversion_report_time_type/0]).

-export_type([openapi_conversion_report_time_type/0]).

-type openapi_conversion_report_time_type() ::
  binary().

openapi_conversion_report_time_type() ->
  elements([<<"TIME_OF_AD_ACTION">>, <<"TIME_OF_CONVERSION">>]).

