-module(openapi_conversion_report_attribution_type).

-include("openapi.hrl").

-export([openapi_conversion_report_attribution_type/0]).

-export_type([openapi_conversion_report_attribution_type/0]).

-type openapi_conversion_report_attribution_type() ::
  binary().

openapi_conversion_report_attribution_type() ->
  elements([<<"INDIVIDUAL">>, <<"HOUSEHOLD">>]).

