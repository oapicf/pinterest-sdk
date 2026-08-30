-module(openapi_attribution_scope).

-include("openapi.hrl").

-export([openapi_attribution_scope/0]).

-export_type([openapi_attribution_scope/0]).

-type openapi_attribution_scope() ::
  binary().

openapi_attribution_scope() ->
  elements([<<"view">>, <<"engagement">>, <<"click">>]).

