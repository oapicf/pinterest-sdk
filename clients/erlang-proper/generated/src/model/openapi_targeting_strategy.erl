-module(openapi_targeting_strategy).

-include("openapi.hrl").

-export([openapi_targeting_strategy/0]).

-export_type([openapi_targeting_strategy/0]).

-type openapi_targeting_strategy() ::
  binary().

openapi_targeting_strategy() ->
  elements([<<"CHOOSE_YOUR_OWN">>, <<"FIND_NEW_CUSTOMERS">>, <<"RECONNECT_WITH_USERS">>]).

