-module(openapi_analytics_metrics_response_daily_metrics).

-export([encode/1]).

-export_type([openapi_analytics_metrics_response_daily_metrics/0]).

-type openapi_analytics_metrics_response_daily_metrics() ::
    #{ 'data_status' => binary(),
       'date' => binary(),
       'metrics' => maps:map()
     }.

encode(#{ 'data_status' := DataStatus,
          'date' := Date,
          'metrics' := Metrics
        }) ->
    #{ 'data_status' => DataStatus,
       'date' => Date,
       'metrics' => Metrics
     }.
