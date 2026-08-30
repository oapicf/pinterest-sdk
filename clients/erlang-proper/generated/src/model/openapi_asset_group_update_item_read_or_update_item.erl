-module(openapi_asset_group_update_item_read_or_update_item).

-include("openapi.hrl").

-export([openapi_asset_group_update_item_read_or_update_item/0]).

-export([openapi_asset_group_update_item_read_or_update_item/1]).

-export_type([openapi_asset_group_update_item_read_or_update_item/0]).

-type openapi_asset_group_update_item_read_or_update_item() ::
  [ {'asset_group_id', binary() }
  | {'asset_group_types', list(openapi_asset_group_type:openapi_asset_group_type()) }
  | {'assets_to_add', list(binary()) }
  | {'assets_to_remove', list(binary()) }
  | {'description', binary() }
  | {'name', binary() }
  ].


openapi_asset_group_update_item_read_or_update_item() ->
    openapi_asset_group_update_item_read_or_update_item([]).

openapi_asset_group_update_item_read_or_update_item(Fields) ->
  Default = [ {'asset_group_id', binary() }
            , {'asset_group_types', list(openapi_asset_group_type:openapi_asset_group_type()) }
            , {'assets_to_add', list(binary()) }
            , {'assets_to_remove', list(binary()) }
            , {'description', binary() }
            , {'name', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

