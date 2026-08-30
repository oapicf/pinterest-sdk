-module(openapi_ai_disclosure_item).

-include("openapi.hrl").

-export([openapi_ai_disclosure_item/0]).

-export_type([openapi_ai_disclosure_item/0]).

-type openapi_ai_disclosure_item() ::
  binary().

openapi_ai_disclosure_item() ->
  elements([<<"AI_MODIFIED">>, <<"SYNTHETIC_PERFORMER">>]).

