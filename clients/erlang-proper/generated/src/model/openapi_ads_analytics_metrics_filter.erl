-module(openapi_ads_analytics_metrics_filter).

-include("openapi.hrl").

-export([openapi_ads_analytics_metrics_filter/0]).

-export([openapi_ads_analytics_metrics_filter/1]).

-export_type([openapi_ads_analytics_metrics_filter/0]).

-type openapi_ads_analytics_metrics_filter() ::
  [ {'field', openapi_ads_analytics_filter_column:openapi_ads_analytics_filter_column() }
  | {'operator', openapi_ads_analytics_filter_operator:openapi_ads_analytics_filter_operator() }
  | {'values', list(integer()) }
  ].


openapi_ads_analytics_metrics_filter() ->
    openapi_ads_analytics_metrics_filter([]).

openapi_ads_analytics_metrics_filter(Fields) ->
  Default = [ {'field', openapi_ads_analytics_filter_column:openapi_ads_analytics_filter_column() }
            , {'operator', openapi_ads_analytics_filter_operator:openapi_ads_analytics_filter_operator() }
            , {'values', list(integer(), 1) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

