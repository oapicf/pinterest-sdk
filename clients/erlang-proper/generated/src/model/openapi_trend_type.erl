-module(openapi_trend_type).

-include("openapi.hrl").

-export([openapi_trend_type/0]).

-export_type([openapi_trend_type/0]).

-type openapi_trend_type() ::
  binary().

openapi_trend_type() ->
  elements([<<"growing">>, <<"monthly">>, <<"yearly">>, <<"seasonal">>]).

