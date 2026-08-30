-module(openapi_pin_type).

-include("openapi.hrl").

-export([openapi_pin_type/0]).

-export_type([openapi_pin_type/0]).

-type openapi_pin_type() ::
  binary().

openapi_pin_type() ->
  elements([<<"PRIVATE">>]).

