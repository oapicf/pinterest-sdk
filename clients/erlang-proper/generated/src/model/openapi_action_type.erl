-module(openapi_action_type).

-include("openapi.hrl").

-export([openapi_action_type/0]).

-export_type([openapi_action_type/0]).

-type openapi_action_type() ::
  binary().

openapi_action_type() ->
  elements([<<"CLICKTHROUGH">>, <<"IMPRESSION">>, <<"VIDEO_V_50_MRC">>, <<"BILLABLE_ENGAGEMENT">>]).

