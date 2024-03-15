-module(openapi_ads_analytics_filter_column).

-include("openapi.hrl").

-export([openapi_ads_analytics_filter_column/0]).

-export_type([openapi_ads_analytics_filter_column/0]).

-type openapi_ads_analytics_filter_column() ::
  binary().

openapi_ads_analytics_filter_column() ->
  elements([<<"SPEND_IN_DOLLAR">>, <<"TOTAL_IMPRESSION">>]).

