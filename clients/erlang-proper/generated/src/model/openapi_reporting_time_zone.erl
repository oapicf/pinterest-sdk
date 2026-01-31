-module(openapi_reporting_time_zone).

-include("openapi.hrl").

-export([openapi_reporting_time_zone/0]).

-export_type([openapi_reporting_time_zone/0]).

-type openapi_reporting_time_zone() ::
  binary().

openapi_reporting_time_zone() ->
  elements([<<"PINTEREST_TIME_ZONE">>, <<"AD_ACCOUNT_TIME_ZONE">>]).

