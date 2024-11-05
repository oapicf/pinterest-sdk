-module(openapi_metrics_reporting_level).

-include("openapi.hrl").

-export([openapi_metrics_reporting_level/0]).

-export_type([openapi_metrics_reporting_level/0]).

-type openapi_metrics_reporting_level() ::
  binary().

openapi_metrics_reporting_level() ->
  elements([<<"ADVERTISER">>, <<"ADVERTISER_TARGETING">>, <<"CAMPAIGN">>, <<"CAMPAIGN_TARGETING">>, <<"AD_GROUP">>, <<"AD_GROUP_TARGETING">>, <<"PIN_PROMOTION">>, <<"PIN_PROMOTION_TARGETING">>, <<"KEYWORD">>, <<"PRODUCT_GROUP">>, <<"PRODUCT_GROUP_TARGETING">>, <<"PRODUCT_ITEM">>, <<"PRODUCT_ITEM_TARGETING">>]).

