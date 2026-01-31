-module(openapi_source_platform_options).

-include("openapi.hrl").

-export([openapi_source_platform_options/0]).

-export_type([openapi_source_platform_options/0]).

-type openapi_source_platform_options() ::
  binary().

openapi_source_platform_options() ->
  elements([<<"WEB">>, <<"MOBILE">>, <<"MOBILE_ANDROID">>, <<"MOBILE_IOS">>, <<"OFFLINE">>, <<"PINTEREST_WEB">>, <<"PINTEREST_ANDROID">>, <<"PINTEREST_IOS">>, <<"POINT_OF_SALE">>]).

