-module(openapi_asset_group_type).

-include("openapi.hrl").

-export([openapi_asset_group_type/0]).

-export_type([openapi_asset_group_type/0]).

-type openapi_asset_group_type() ::
  binary().

openapi_asset_group_type() ->
  elements([<<"BRAND">>, <<"LOCATION_OR_LANGUAGE">>, <<"PRODUCT_LINE">>, <<"OTHER">>]).

