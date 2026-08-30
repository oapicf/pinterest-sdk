-module(openapi_trending_topic).

-include("openapi.hrl").

-export([openapi_trending_topic/0]).

-export([openapi_trending_topic/1]).

-export_type([openapi_trending_topic/0]).

-type openapi_trending_topic() ::
  [ {'description', binary() }
  | {'id', binary() }
  | {'percent_growth_mom', integer() }
  | {'pins', list(openapi_trending_pin:openapi_trending_pin()) }
  | {'related_interests', list(binary()) }
  | {'related_searches', list(binary()) }
  | {'time_series', map() }
  | {'title', binary() }
  ].


openapi_trending_topic() ->
    openapi_trending_topic([]).

openapi_trending_topic(Fields) ->
  Default = [ {'description', binary() }
            , {'id', binary() }
            , {'percent_growth_mom', integer() }
            , {'pins', list(openapi_trending_pin:openapi_trending_pin()) }
            , {'related_interests', list(binary()) }
            , {'related_searches', list(binary()) }
            , {'time_series', map() }
            , {'title', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

