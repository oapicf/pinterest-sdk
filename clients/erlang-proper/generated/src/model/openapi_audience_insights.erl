-module(openapi_audience_insights).

-include("openapi.hrl").

-export([openapi_audience_insights/0]).

-export([openapi_audience_insights/1]).

-export_type([openapi_audience_insights/0]).

-type openapi_audience_insights() ::
  [ {'categories', list(openapi_audience_category:openapi_audience_category()) }
  | {'date', binary() }
  | {'demographics', openapi_audience_demographics:openapi_audience_demographics() }
  | {'size', integer() }
  | {'size_is_upper_bound', boolean() }
  | {'type', openapi_audience_insight_type:openapi_audience_insight_type() }
  ].


openapi_audience_insights() ->
    openapi_audience_insights([]).

openapi_audience_insights(Fields) ->
  Default = [ {'categories', list(openapi_audience_category:openapi_audience_category()) }
            , {'date', binary() }
            , {'demographics', openapi_audience_demographics:openapi_audience_demographics() }
            , {'size', integer() }
            , {'size_is_upper_bound', boolean() }
            , {'type', openapi_audience_insight_type:openapi_audience_insight_type() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

