-module(openapi_analytics_daily_metrics).

-include("openapi.hrl").

-export([openapi_analytics_daily_metrics/0]).

-export([openapi_analytics_daily_metrics/1]).

-export_type([openapi_analytics_daily_metrics/0]).

-type openapi_analytics_daily_metrics() ::
  [ {'data_status', openapi_data_status:openapi_data_status() }
  | {'date', binary() }
  | {'metrics', map() }
  ].


openapi_analytics_daily_metrics() ->
    openapi_analytics_daily_metrics([]).

openapi_analytics_daily_metrics(Fields) ->
  Default = [ {'data_status', openapi_data_status:openapi_data_status() }
            , {'date', binary() }
            , {'metrics', map() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

