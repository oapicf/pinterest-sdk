-module(openapi_pin_analytics_metrics_response_daily_metrics_inner).

-include("openapi.hrl").

-export([openapi_pin_analytics_metrics_response_daily_metrics_inner/0]).

-export([openapi_pin_analytics_metrics_response_daily_metrics_inner/1]).

-export_type([openapi_pin_analytics_metrics_response_daily_metrics_inner/0]).

-type openapi_pin_analytics_metrics_response_daily_metrics_inner() ::
  [ {'data_status', openapi_data_status:openapi_data_status() }
  | {'date', binary() }
  | {'metrics', map() }
  ].


openapi_pin_analytics_metrics_response_daily_metrics_inner() ->
    openapi_pin_analytics_metrics_response_daily_metrics_inner([]).

openapi_pin_analytics_metrics_response_daily_metrics_inner(Fields) ->
  Default = [ {'data_status', openapi_data_status:openapi_data_status() }
            , {'date', binary() }
            , {'metrics', map() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

