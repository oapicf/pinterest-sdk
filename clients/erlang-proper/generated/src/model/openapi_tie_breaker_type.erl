-module(openapi_tie_breaker_type).

-include("openapi.hrl").

-export([openapi_tie_breaker_type/0]).

-export_type([openapi_tie_breaker_type/0]).

-type openapi_tie_breaker_type() ::
  binary().

openapi_tie_breaker_type() ->
  elements([<<"RANDOM">>, <<"CUSTOM">>]).

