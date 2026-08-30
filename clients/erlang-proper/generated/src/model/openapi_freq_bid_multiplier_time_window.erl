-module(openapi_freq_bid_multiplier_time_window).

-include("openapi.hrl").

-export([openapi_freq_bid_multiplier_time_window/0]).

-export_type([openapi_freq_bid_multiplier_time_window/0]).

-type openapi_freq_bid_multiplier_time_window() ::
  binary().

openapi_freq_bid_multiplier_time_window() ->
  elements([<<"WEEK">>, <<"MONTH">>, <<"">>]).

