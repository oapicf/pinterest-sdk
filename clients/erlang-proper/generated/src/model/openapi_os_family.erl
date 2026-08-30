-module(openapi_os_family).

-include("openapi.hrl").

-export([openapi_os_family/0]).

-export_type([openapi_os_family/0]).

-type openapi_os_family() ::
  binary().

openapi_os_family() ->
  elements([<<"ios">>, <<"android">>, <<"macos">>, <<"windows">>, <<"linux">>, <<"bsd">>, <<"other">>]).

