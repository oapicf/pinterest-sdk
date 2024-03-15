-module(openapi_keyword_metrics_response).

-include("openapi.hrl").

-export([openapi_keyword_metrics_response/0]).

-export([openapi_keyword_metrics_response/1]).

-export_type([openapi_keyword_metrics_response/0]).

-type openapi_keyword_metrics_response() ::
  [ {'keyword', binary() }
  | {'metrics', openapi_keyword_metrics:openapi_keyword_metrics() }
  ].


openapi_keyword_metrics_response() ->
    openapi_keyword_metrics_response([]).

openapi_keyword_metrics_response(Fields) ->
  Default = [ {'keyword', binary() }
            , {'metrics', openapi_keyword_metrics:openapi_keyword_metrics() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

