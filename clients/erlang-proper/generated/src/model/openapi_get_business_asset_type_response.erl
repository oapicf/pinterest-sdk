-module(openapi_get_business_asset_type_response).

-include("openapi.hrl").

-export([openapi_get_business_asset_type_response/0]).

-export_type([openapi_get_business_asset_type_response/0]).

-type openapi_get_business_asset_type_response() ::
  binary().

openapi_get_business_asset_type_response() ->
  elements([<<"AD_ACCOUNT">>, <<"PROFILE">>, <<"ASSET_GROUP">>, <<"CONVERSION_TAG">>]).

