-module(openapi_conversion_event).

-include("openapi.hrl").

-export([openapi_conversion_event/0]).

-export_type([openapi_conversion_event/0]).

-type openapi_conversion_event() ::
  binary().

openapi_conversion_event() ->
  elements([<<"PAGE_VISIT">>, <<"SIGNUP">>, <<"CHECKOUT">>, <<"CUSTOM">>, <<"VIEW_CATEGORY">>, <<"SEARCH">>, <<"ADD_TO_CART">>, <<"WATCH_VIDEO">>, <<"LEAD">>, <<"APP_INSTALL">>]).

