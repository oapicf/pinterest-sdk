-module(openapi_ad_account_entity_type).

-include("openapi.hrl").

-export([openapi_ad_account_entity_type/0]).

-export_type([openapi_ad_account_entity_type/0]).

-type openapi_ad_account_entity_type() ::
  binary().

openapi_ad_account_entity_type() ->
  elements([<<"ADVERTISER">>, <<"CAMPAIGN">>, <<"AD_GROUP">>, <<"AD">>]).

