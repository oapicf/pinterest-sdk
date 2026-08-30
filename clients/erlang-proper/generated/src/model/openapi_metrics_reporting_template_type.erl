-module(openapi_metrics_reporting_template_type).

-include("openapi.hrl").

-export([openapi_metrics_reporting_template_type/0]).

-export_type([openapi_metrics_reporting_template_type/0]).

-type openapi_metrics_reporting_template_type() ::
  binary().

openapi_metrics_reporting_template_type() ->
  elements([<<"UNSPECIFIED">>, <<"BULK">>, <<"OVERVIEW">>, <<"TABLE">>, <<"MMM">>, <<"BRAND_CATEGORY">>]).

