-module(openapi_lookback_period_options).

-include("openapi.hrl").

-export([openapi_lookback_period_options/0]).

-export_type([openapi_lookback_period_options/0]).

-type openapi_lookback_period_options() ::
  binary().

openapi_lookback_period_options() ->
  elements([<<"1d">>, <<"14d">>]).

