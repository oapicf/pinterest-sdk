-module(openapi_asset_group_deletion_delete).

-export([encode/1]).

-export_type([openapi_asset_group_deletion_delete/0]).

-type openapi_asset_group_deletion_delete() ::
    #{ 'asset_groups_to_delete' := list()
     }.

encode(#{ 'asset_groups_to_delete' := AssetGroupsToDelete
        }) ->
    #{ 'asset_groups_to_delete' => AssetGroupsToDelete
     }.
