-module(openapi_update_asset_group_body).

-export([encode/1]).

-export_type([openapi_update_asset_group_body/0]).

-type openapi_update_asset_group_body() ::
    #{ 'asset_groups_to_update' => list()
     }.

encode(#{ 'asset_groups_to_update' := AssetGroupsToUpdate
        }) ->
    #{ 'asset_groups_to_update' => AssetGroupsToUpdate
     }.
