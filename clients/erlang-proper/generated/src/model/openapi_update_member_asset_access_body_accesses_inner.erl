-module(openapi_update_member_asset_access_body_accesses_inner).

-include("openapi.hrl").

-export([openapi_update_member_asset_access_body_accesses_inner/0]).

-export([openapi_update_member_asset_access_body_accesses_inner/1]).

-export_type([openapi_update_member_asset_access_body_accesses_inner/0]).

-type openapi_update_member_asset_access_body_accesses_inner() ::
  [ {'asset_id', binary() }
  | {'member_id', binary() }
  | {'permissions', list(openapi_permissions:openapi_permissions()) }
  ].


openapi_update_member_asset_access_body_accesses_inner() ->
    openapi_update_member_asset_access_body_accesses_inner([]).

openapi_update_member_asset_access_body_accesses_inner(Fields) ->
  Default = [ {'asset_id', binary() }
            , {'member_id', binary() }
            , {'permissions', list(openapi_permissions:openapi_permissions(), 1, 50) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

