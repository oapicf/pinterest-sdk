-module(openapi_analytics_daily_metrics).

-export([encode/1]).

-export_type([openapi_analytics_daily_metrics/0]).

-type openapi_analytics_daily_metrics() ::
    #{ 'data_status' => openapi_data_status:openapi_data_status(),
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
