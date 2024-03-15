-module(openapi_ads_analytics_filter_operator).

-include("openapi.hrl").

-export([openapi_ads_analytics_filter_operator/0]).

-export_type([openapi_ads_analytics_filter_operator/0]).

-type openapi_ads_analytics_filter_operator() ::
  binary().

openapi_ads_analytics_filter_operator() ->
  elements([<<"LESS_THAN">>, <<"GREATER_THAN">>]).

