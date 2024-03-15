-module(openapi_pin_analytics_metrics_response).

-export([encode/1]).

-export_type([openapi_pin_analytics_metrics_response/0]).

-type openapi_pin_analytics_metrics_response() ::
    #{ 'lifetime_metrics' => maps:map(),
       'daily_metrics' => list(),
       'summary_metrics' => maps:map()
     }.

encode(#{ 'lifetime_metrics' := LifetimeMetrics,
          'daily_metrics' := DailyMetrics,
          'summary_metrics' := SummaryMetrics
        }) ->
    #{ 'lifetime_metrics' => LifetimeMetrics,
       'daily_metrics' => DailyMetrics,
       'summary_metrics' => SummaryMetrics
     }.
