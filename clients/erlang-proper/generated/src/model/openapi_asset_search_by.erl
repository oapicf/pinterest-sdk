-module(openapi_asset_search_by).

-include("openapi.hrl").

-export([openapi_asset_search_by/0]).

-export_type([openapi_asset_search_by/0]).

-type openapi_asset_search_by() ::
  binary().

openapi_asset_search_by() ->
  elements([<<"NAME">>, <<"ID">>, <<"NAME_OR_ID">>, <<"OWNER_NAME">>, <<"NAME_OR_OWNER">>]).

