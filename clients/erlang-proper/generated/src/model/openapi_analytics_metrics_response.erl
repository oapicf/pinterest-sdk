-module(openapi_analytics_metrics_response).

-include("openapi.hrl").

-export([openapi_analytics_metrics_response/0]).

-export([openapi_analytics_metrics_response/1]).

-export_type([openapi_analytics_metrics_response/0]).

-type openapi_analytics_metrics_response() ::
  [ {'summary_metrics', map() }
  | {'daily_metrics', list(openapi_analytics_daily_metrics:openapi_analytics_daily_metrics()) }
  ].


openapi_analytics_metrics_response() ->
    openapi_analytics_metrics_response([]).

openapi_analytics_metrics_response(Fields) ->
  Default = [ {'summary_metrics', map() }
            , {'daily_metrics', list(openapi_analytics_daily_metrics:openapi_analytics_daily_metrics()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

