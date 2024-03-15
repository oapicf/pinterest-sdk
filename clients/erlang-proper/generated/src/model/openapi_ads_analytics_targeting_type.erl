-module(openapi_ads_analytics_targeting_type).

-include("openapi.hrl").

-export([openapi_ads_analytics_targeting_type/0]).

-export_type([openapi_ads_analytics_targeting_type/0]).

-type openapi_ads_analytics_targeting_type() ::
  binary().

openapi_ads_analytics_targeting_type() ->
  elements([<<"KEYWORD">>, <<"APPTYPE">>, <<"GENDER">>, <<"LOCATION">>, <<"PLACEMENT">>, <<"COUNTRY">>, <<"TARGETED_INTEREST">>, <<"PINNER_INTEREST">>, <<"AUDIENCE_INCLUDE">>, <<"GEO">>, <<"AGE_BUCKET">>, <<"REGION">>]).

