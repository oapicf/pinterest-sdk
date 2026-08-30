-module(openapi_custom_conversion_event_metrics).

-export([encode/1]).

-export_type([openapi_custom_conversion_event_metrics/0]).

-type openapi_custom_conversion_event_metrics() ::
    #{ 'custom_event_metrics_type' := openapi_ade_column_type:openapi_ade_column_type(),
       'custom_event_name' := binary()
     }.

encode(#{ 'custom_event_metrics_type' := CustomEventMetricsType,
          'custom_event_name' := CustomEventName
        }) ->
    #{ 'custom_event_metrics_type' => CustomEventMetricsType,
       'custom_event_name' => CustomEventName
     }.
