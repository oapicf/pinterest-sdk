-module(openapi_mobile_app_platform).

-include("openapi.hrl").

-export([openapi_mobile_app_platform/0]).

-export_type([openapi_mobile_app_platform/0]).

-type openapi_mobile_app_platform() ::
  binary().

openapi_mobile_app_platform() ->
  elements([<<"IOS">>, <<"ANDROID">>]).

