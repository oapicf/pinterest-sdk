-module(openapi_asset_type_response).

-include("openapi.hrl").

-export([openapi_asset_type_response/0]).

-export_type([openapi_asset_type_response/0]).

-type openapi_asset_type_response() ::
  binary().

openapi_asset_type_response() ->
  elements([<<"AD_ACCOUNT">>, <<"MERCHANT">>, <<"PROFILE">>, <<"ASSET_GROUP">>, <<"PINNER_LIST">>, <<"CONVERSION_TAG">>, <<"CATALOG">>, <<"CONVERSION_SEGMENT">>]).

