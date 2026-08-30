-module(openapi_asset_group_modification_read_or_update).

-include("openapi.hrl").

-export([openapi_asset_group_modification_read_or_update/0]).

-export([openapi_asset_group_modification_read_or_update/1]).

-export_type([openapi_asset_group_modification_read_or_update/0]).

-type openapi_asset_group_modification_read_or_update() ::
  [ {'asset_groups_to_update', list(openapi_asset_group_update_item_read_or_update_item:openapi_asset_group_update_item_read_or_update_item()) }
  | {'exceptions', list(openapi_asset_group_update_error:openapi_asset_group_update_error()) }
  | {'updated_asset_groups', list(openapi_asset_group_binding:openapi_asset_group_binding()) }
  ].


openapi_asset_group_modification_read_or_update() ->
    openapi_asset_group_modification_read_or_update([]).

openapi_asset_group_modification_read_or_update(Fields) ->
  Default = [ {'asset_groups_to_update', list(openapi_asset_group_update_item_read_or_update_item:openapi_asset_group_update_item_read_or_update_item()) }
            , {'exceptions', list(openapi_asset_group_update_error:openapi_asset_group_update_error()) }
            , {'updated_asset_groups', list(openapi_asset_group_binding:openapi_asset_group_binding()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

