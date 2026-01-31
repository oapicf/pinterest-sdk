-module(openapi_pin_analytics_metrics_response).

-export([encode/1]).

-export_type([openapi_pin_analytics_metrics_response/0]).

-type openapi_pin_analytics_metrics_response() ::
    #{ 'daily_metrics' => list(),
       'lifetime_metrics' => maps:map(),
       'summary_metrics' => maps:map()
     }.

encode(#{ 'daily_metrics' := DailyMetrics,
          'lifetime_metrics' := LifetimeMetrics,
          'summary_metrics' := SummaryMetrics
        }) ->
    #{ 'daily_metrics' => DailyMetrics,
       'lifetime_metrics' => LifetimeMetrics,
       'summary_metrics' => SummaryMetrics
     }.
