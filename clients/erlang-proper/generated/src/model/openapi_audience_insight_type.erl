-module(openapi_audience_insight_type).

-include("openapi.hrl").

-export([openapi_audience_insight_type/0]).

-export_type([openapi_audience_insight_type/0]).

-type openapi_audience_insight_type() ::
  binary().

openapi_audience_insight_type() ->
  elements([<<"YOUR_TOTAL_AUDIENCE">>, <<"YOUR_ENGAGED_AUDIENCE">>, <<"PINTEREST_TOTAL_AUDIENCE">>]).

