-module(openapi_ads_analytics_create_async_request_all_of_custom_conversion_event_metrics).

-export([encode/1]).

-export_type([openapi_ads_analytics_create_async_request_all_of_custom_conversion_event_metrics/0]).

-type openapi_ads_analytics_create_async_request_all_of_custom_conversion_event_metrics() ::
    #{ 'custom_event_metrics_type' := binary(),
       'custom_event_name' := binary()
     }.

encode(#{ 'custom_event_metrics_type' := CustomEventMetricsType,
          'custom_event_name' := CustomEventName
        }) ->
    #{ 'custom_event_metrics_type' => CustomEventMetricsType,
       'custom_event_name' => CustomEventName
     }.
