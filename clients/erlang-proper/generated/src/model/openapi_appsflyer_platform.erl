-module(openapi_appsflyer_platform).

-include("openapi.hrl").

-export([openapi_appsflyer_platform/0]).

-export_type([openapi_appsflyer_platform/0]).

-type openapi_appsflyer_platform() ::
  binary().

openapi_appsflyer_platform() ->
  elements([<<"android">>, <<"ios">>]).

