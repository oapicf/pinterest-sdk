-module(openapi_pin_analytics_metrics_response_daily_metrics_inner).

-export([encode/1]).

-export_type([openapi_pin_analytics_metrics_response_daily_metrics_inner/0]).

-type openapi_pin_analytics_metrics_response_daily_metrics_inner() ::
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
