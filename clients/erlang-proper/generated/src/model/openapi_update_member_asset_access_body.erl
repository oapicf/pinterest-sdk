-module(openapi_update_member_asset_access_body).

-include("openapi.hrl").

-export([openapi_update_member_asset_access_body/0]).

-export([openapi_update_member_asset_access_body/1]).

-export_type([openapi_update_member_asset_access_body/0]).

-type openapi_update_member_asset_access_body() ::
  [ {'accesses', list(openapi_update_member_asset_access_body_accesses_inner:openapi_update_member_asset_access_body_accesses_inner()) }
  ].


openapi_update_member_asset_access_body() ->
    openapi_update_member_asset_access_body([]).

openapi_update_member_asset_access_body(Fields) ->
  Default = [ {'accesses', list(openapi_update_member_asset_access_body_accesses_inner:openapi_update_member_asset_access_body_accesses_inner(), 1, 50) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

