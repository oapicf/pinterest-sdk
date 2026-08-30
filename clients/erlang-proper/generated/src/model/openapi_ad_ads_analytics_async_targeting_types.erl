-module(openapi_ad_ads_analytics_async_targeting_types).

-include("openapi.hrl").

-export([openapi_ad_ads_analytics_async_targeting_types/0]).

-export_type([openapi_ad_ads_analytics_async_targeting_types/0]).

-type openapi_ad_ads_analytics_async_targeting_types() ::
  binary().

openapi_ad_ads_analytics_async_targeting_types() ->
  elements([<<"KEYWORD">>, <<"APPTYPE">>, <<"GENDER">>, <<"LOCATION">>, <<"PLACEMENT">>, <<"COUNTRY">>, <<"TARGETED_INTEREST">>, <<"PINNER_INTEREST">>, <<"AUDIENCE_INCLUDE">>, <<"GEO">>, <<"AGE_BUCKET">>, <<"REGION">>, <<"MEDIA_TYPE">>, <<"AGE_BUCKET_AND_GENDER">>, <<"AUDIENCE_MULTIPLIER">>, <<"CREATIVE_ENHANCEMENTS">>, <<"LOCAL_ADS_STORE_CODE">>]).

