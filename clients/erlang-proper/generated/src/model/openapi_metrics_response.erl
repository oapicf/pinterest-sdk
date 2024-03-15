-module(openapi_metrics_response).

-include("openapi.hrl").

-export([openapi_metrics_response/0]).

-export([openapi_metrics_response/1]).

-export_type([openapi_metrics_response/0]).

-type openapi_metrics_response() ::
  [ {'data', list(map()) }
  ].


openapi_metrics_response() ->
    openapi_metrics_response([]).

openapi_metrics_response(Fields) ->
  Default = [ {'data', list(map()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

