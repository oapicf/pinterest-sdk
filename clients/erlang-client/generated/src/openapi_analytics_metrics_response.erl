-module(openapi_analytics_metrics_response).

-export([encode/1]).

-export_type([openapi_analytics_metrics_response/0]).

-type openapi_analytics_metrics_response() ::
    #{ 'summary_metrics' => maps:map(),
       'daily_metrics' => list()
     }.

encode(#{ 'summary_metrics' := SummaryMetrics,
          'daily_metrics' := DailyMetrics
        }) ->
    #{ 'summary_metrics' => SummaryMetrics,
       'daily_metrics' => DailyMetrics
     }.
