-module(openapi_update_asset_group_body_asset_groups_to_update_inner).

-include("openapi.hrl").

-export([openapi_update_asset_group_body_asset_groups_to_update_inner/0]).

-export([openapi_update_asset_group_body_asset_groups_to_update_inner/1]).

-export_type([openapi_update_asset_group_body_asset_groups_to_update_inner/0]).

-type openapi_update_asset_group_body_asset_groups_to_update_inner() ::
  [ {'asset_group_id', binary() }
  | {'name', binary() }
  | {'description', binary() }
  | {'asset_group_types', list(openapi_asset_group_type:openapi_asset_group_type()) }
  | {'assets_to_add', list(binary()) }
  | {'assets_to_remove', list(binary()) }
  ].


openapi_update_asset_group_body_asset_groups_to_update_inner() ->
    openapi_update_asset_group_body_asset_groups_to_update_inner([]).

openapi_update_asset_group_body_asset_groups_to_update_inner(Fields) ->
  Default = [ {'asset_group_id', binary() }
            , {'name', binary() }
            , {'description', binary() }
            , {'asset_group_types', list(openapi_asset_group_type:openapi_asset_group_type()) }
            , {'assets_to_add', list(binary()) }
            , {'assets_to_remove', list(binary()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

