-module(openapi_match_type_response).

-include("openapi.hrl").

-export([openapi_match_type_response/0]).

-export_type([openapi_match_type_response/0]).

-type openapi_match_type_response() ::
  binary().

openapi_match_type_response() ->
  elements([<<"BROAD">>, <<"PHRASE">>, <<"EXACT">>, <<"EXACT_NEGATIVE">>, <<"PHRASE_NEGATIVE">>, <<"">>]).

