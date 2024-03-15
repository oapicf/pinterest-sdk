-module(openapi_trending_keywords_response_trends_inner).

-include("openapi.hrl").

-export([openapi_trending_keywords_response_trends_inner/0]).

-export([openapi_trending_keywords_response_trends_inner/1]).

-export_type([openapi_trending_keywords_response_trends_inner/0]).

-type openapi_trending_keywords_response_trends_inner() ::
  [ {'keyword', binary() }
  | {'pct_growth_wow', integer() }
  | {'pct_growth_mom', integer() }
  | {'pct_growth_yoy', integer() }
  | {'time_series', openapi_trending_keywords_response_trends_inner_time_series:openapi_trending_keywords_response_trends_inner_time_series() }
  ].


openapi_trending_keywords_response_trends_inner() ->
    openapi_trending_keywords_response_trends_inner([]).

openapi_trending_keywords_response_trends_inner(Fields) ->
  Default = [ {'keyword', binary(1) }
            , {'pct_growth_wow', integer() }
            , {'pct_growth_mom', integer() }
            , {'pct_growth_yoy', integer() }
            , {'time_series', openapi_trending_keywords_response_trends_inner_time_series:openapi_trending_keywords_response_trends_inner_time_series() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

