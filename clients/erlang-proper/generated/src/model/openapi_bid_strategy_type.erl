-module(openapi_bid_strategy_type).

-include("openapi.hrl").

-export([openapi_bid_strategy_type/0]).

-export_type([openapi_bid_strategy_type/0]).

-type openapi_bid_strategy_type() ::
  binary().

openapi_bid_strategy_type() ->
  elements([<<"AUTOMATIC_BID">>, <<"MAX_BID">>, <<"TARGET_AVG">>, <<"">>]).

