-module(openapi_trending_keyword).

-include("openapi.hrl").

-export([openapi_trending_keyword/0]).

-export([openapi_trending_keyword/1]).

-export_type([openapi_trending_keyword/0]).

-type openapi_trending_keyword() ::
  [ {'demographics', openapi_trending_keyword_demographics:openapi_trending_keyword_demographics() }
  | {'has_prediction', boolean() }
  | {'keyword', binary() }
  | {'pct_growth_mom', integer() }
  | {'pct_growth_wow', integer() }
  | {'pct_growth_yoy', integer() }
  | {'predicted_time_series', openapi_predicted_time_series:openapi_predicted_time_series() }
  | {'time_series', openapi_time_series:openapi_time_series() }
  ].


openapi_trending_keyword() ->
    openapi_trending_keyword([]).

openapi_trending_keyword(Fields) ->
  Default = [ {'demographics', openapi_trending_keyword_demographics:openapi_trending_keyword_demographics() }
            , {'has_prediction', boolean() }
            , {'keyword', binary(1) }
            , {'pct_growth_mom', integer() }
            , {'pct_growth_wow', integer() }
            , {'pct_growth_yoy', integer() }
            , {'predicted_time_series', openapi_predicted_time_series:openapi_predicted_time_series() }
            , {'time_series', openapi_time_series:openapi_time_series() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

