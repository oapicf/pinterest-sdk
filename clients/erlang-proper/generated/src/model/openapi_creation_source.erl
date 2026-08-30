-module(openapi_creation_source).

-include("openapi.hrl").

-export([openapi_creation_source/0]).

-export_type([openapi_creation_source/0]).

-type openapi_creation_source() ::
  binary().

openapi_creation_source() ->
  elements([<<"ADS_API">>, <<"ADS_MANAGER_REPORTING_PAGE">>, <<"ADS_MANAGER_REPORT_BUILDER">>]).

