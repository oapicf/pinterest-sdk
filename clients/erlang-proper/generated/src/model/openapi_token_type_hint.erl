-module(openapi_token_type_hint).

-include("openapi.hrl").

-export([openapi_token_type_hint/0]).

-export_type([openapi_token_type_hint/0]).

-type openapi_token_type_hint() ::
  binary().

openapi_token_type_hint() ->
  elements([<<"access_token">>, <<"refresh_token">>]).

