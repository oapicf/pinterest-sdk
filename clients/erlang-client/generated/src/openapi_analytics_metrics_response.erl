-module(openapi_analytics_metrics_response).

-export([encode/1]).

-export_type([openapi_analytics_metrics_response/0]).

-type openapi_analytics_metrics_response() ::
    #{ 'daily_metrics' => list(),
       'summary_metrics' => maps:map()
     }.

encode(#{ 'daily_metrics' := DailyMetrics,
          'summary_metrics' := SummaryMetrics
        }) ->
    #{ 'daily_metrics' => DailyMetrics,
       'summary_metrics' => SummaryMetrics
     }.
