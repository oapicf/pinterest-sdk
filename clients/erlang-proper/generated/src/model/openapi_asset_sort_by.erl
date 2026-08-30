-module(openapi_asset_sort_by).

-include("openapi.hrl").

-export([openapi_asset_sort_by/0]).

-export_type([openapi_asset_sort_by/0]).

-type openapi_asset_sort_by() ::
  binary().

openapi_asset_sort_by() ->
  elements([<<"NAME">>, <<"ID">>, <<"PERMISSIONS">>]).

