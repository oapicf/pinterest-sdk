-module(openapi_asset_permission_type).

-include("openapi.hrl").

-export([openapi_asset_permission_type/0]).

-export_type([openapi_asset_permission_type/0]).

-type openapi_asset_permission_type() ::
  binary().

openapi_asset_permission_type() ->
  elements([<<"AGGREGATED_PERMISSION">>, <<"DIRECT_PERMISSION">>]).

