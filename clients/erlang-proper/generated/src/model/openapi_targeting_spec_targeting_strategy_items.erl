-module(openapi_targeting_spec_targeting_strategy_items).

-include("openapi.hrl").

-export([openapi_targeting_spec_targeting_strategy_items/0]).

-export_type([openapi_targeting_spec_targeting_strategy_items/0]).

-type openapi_targeting_spec_targeting_strategy_items() ::
  binary().

openapi_targeting_spec_targeting_strategy_items() ->
  elements([<<"CHOOSE_YOUR_OWN">>, <<"FIND_NEW_CUSTOMERS">>, <<"RECONNECT_WITH_USERS">>]).

