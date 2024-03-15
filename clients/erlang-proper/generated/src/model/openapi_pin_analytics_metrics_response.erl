-module(openapi_pin_analytics_metrics_response).

-include("openapi.hrl").

-export([openapi_pin_analytics_metrics_response/0]).

-export([openapi_pin_analytics_metrics_response/1]).

-export_type([openapi_pin_analytics_metrics_response/0]).

-type openapi_pin_analytics_metrics_response() ::
  [ {'lifetime_metrics', map() }
  | {'daily_metrics', list(openapi_pin_analytics_metrics_response_daily_metrics_inner:openapi_pin_analytics_metrics_response_daily_metrics_inner()) }
  | {'summary_metrics', map() }
  ].


openapi_pin_analytics_metrics_response() ->
    openapi_pin_analytics_metrics_response([]).

openapi_pin_analytics_metrics_response(Fields) ->
  Default = [ {'lifetime_metrics', map() }
            , {'daily_metrics', list(openapi_pin_analytics_metrics_response_daily_metrics_inner:openapi_pin_analytics_metrics_response_daily_metrics_inner()) }
            , {'summary_metrics', map() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

