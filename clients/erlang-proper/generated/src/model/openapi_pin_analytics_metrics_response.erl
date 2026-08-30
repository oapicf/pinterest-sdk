-module(openapi_pin_analytics_metrics_response).

-include("openapi.hrl").

-export([openapi_pin_analytics_metrics_response/0]).

-export([openapi_pin_analytics_metrics_response/1]).

-export_type([openapi_pin_analytics_metrics_response/0]).

-type openapi_pin_analytics_metrics_response() ::
  [ {'daily_metrics', list(openapi_pin_analytics_daily_metrics:openapi_pin_analytics_daily_metrics()) }
  | {'lifetime_metrics', map() }
  | {'summary_metrics', map() }
  ].


openapi_pin_analytics_metrics_response() ->
    openapi_pin_analytics_metrics_response([]).

openapi_pin_analytics_metrics_response(Fields) ->
  Default = [ {'daily_metrics', list(openapi_pin_analytics_daily_metrics:openapi_pin_analytics_daily_metrics()) }
            , {'lifetime_metrics', map() }
            , {'summary_metrics', map() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

