-module(openapi_match_type).

-include("openapi.hrl").

-export([openapi_match_type/0]).

-export_type([openapi_match_type/0]).

-type openapi_match_type() ::
  binary().

openapi_match_type() ->
  elements([<<"BROAD">>, <<"PHRASE">>, <<"EXACT">>, <<"EXACT_NEGATIVE">>, <<"PHRASE_NEGATIVE">>]).

