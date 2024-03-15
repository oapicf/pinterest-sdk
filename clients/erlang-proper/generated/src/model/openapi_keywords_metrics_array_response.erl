-module(openapi_keywords_metrics_array_response).

-include("openapi.hrl").

-export([openapi_keywords_metrics_array_response/0]).

-export([openapi_keywords_metrics_array_response/1]).

-export_type([openapi_keywords_metrics_array_response/0]).

-type openapi_keywords_metrics_array_response() ::
  [ {'data', list(openapi_keyword_metrics_response:openapi_keyword_metrics_response()) }
  ].


openapi_keywords_metrics_array_response() ->
    openapi_keywords_metrics_array_response([]).

openapi_keywords_metrics_array_response(Fields) ->
  Default = [ {'data', list(openapi_keyword_metrics_response:openapi_keyword_metrics_response()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

