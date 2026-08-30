-module(openapi_attribution_action_type).

-include("openapi.hrl").

-export([openapi_attribution_action_type/0]).

-export_type([openapi_attribution_action_type/0]).

-type openapi_attribution_action_type() ::
  binary().

openapi_attribution_action_type() ->
  elements([<<"view">>, <<"click">>]).

