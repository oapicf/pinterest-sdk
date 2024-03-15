-module(openapi_granularity).

-include("openapi.hrl").

-export([openapi_granularity/0]).

-export_type([openapi_granularity/0]).

-type openapi_granularity() ::
  binary().

openapi_granularity() ->
  elements([<<"TOTAL">>, <<"DAY">>, <<"HOUR">>, <<"WEEK">>, <<"MONTH">>]).

