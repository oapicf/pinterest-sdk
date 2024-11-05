-module(openapi_delete_asset_group_body).

-export([encode/1]).

-export_type([openapi_delete_asset_group_body/0]).

-type openapi_delete_asset_group_body() ::
    #{ 'asset_groups_to_delete' := list()
     }.

encode(#{ 'asset_groups_to_delete' := AssetGroupsToDelete
        }) ->
    #{ 'asset_groups_to_delete' => AssetGroupsToDelete
     }.
