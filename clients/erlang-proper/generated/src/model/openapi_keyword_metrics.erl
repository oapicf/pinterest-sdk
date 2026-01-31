-module(openapi_keyword_metrics).

-include("openapi.hrl").

-export([openapi_keyword_metrics/0]).

-export([openapi_keyword_metrics/1]).

-export_type([openapi_keyword_metrics/0]).

-type openapi_keyword_metrics() ::
  [ {'keyword_query_volume', binary() }
  ].


openapi_keyword_metrics() ->
    openapi_keyword_metrics([]).

openapi_keyword_metrics(Fields) ->
  Default = [ {'keyword_query_volume', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

