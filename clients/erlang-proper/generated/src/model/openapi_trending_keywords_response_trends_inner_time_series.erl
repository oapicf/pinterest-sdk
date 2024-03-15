-module(openapi_trending_keywords_response_trends_inner_time_series).

-include("openapi.hrl").

-export([openapi_trending_keywords_response_trends_inner_time_series/0]).

-export([openapi_trending_keywords_response_trends_inner_time_series/1]).

-export_type([openapi_trending_keywords_response_trends_inner_time_series/0]).

-type openapi_trending_keywords_response_trends_inner_time_series() ::
  [ {'date', date() }
  ].


openapi_trending_keywords_response_trends_inner_time_series() ->
    openapi_trending_keywords_response_trends_inner_time_series([]).

openapi_trending_keywords_response_trends_inner_time_series(Fields) ->
  Default = [ {'date', date() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

