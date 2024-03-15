-module(openapi_ads_analytics_metrics_filter).

-export([encode/1]).

-export_type([openapi_ads_analytics_metrics_filter/0]).

-type openapi_ads_analytics_metrics_filter() ::
    #{ 'field' := openapi_ads_analytics_filter_column:openapi_ads_analytics_filter_column(),
       'operator' := openapi_ads_analytics_filter_operator:openapi_ads_analytics_filter_operator(),
       'values' := list()
     }.

encode(#{ 'field' := Field,
          'operator' := Operator,
          'values' := Values
        }) ->
    #{ 'field' => Field,
       'operator' => Operator,
       'values' => Values
     }.
