-module(openapi_asset_group_modification_read_or_update).

-export([encode/1]).

-export_type([openapi_asset_group_modification_read_or_update/0]).

-type openapi_asset_group_modification_read_or_update() ::
    #{ 'asset_groups_to_update' => list(),
       'exceptions' => list(),
       'updated_asset_groups' => list()
     }.

encode(#{ 'asset_groups_to_update' := AssetGroupsToUpdate,
          'exceptions' := Exceptions,
          'updated_asset_groups' := UpdatedAssetGroups
        }) ->
    #{ 'asset_groups_to_update' => AssetGroupsToUpdate,
       'exceptions' => Exceptions,
       'updated_asset_groups' => UpdatedAssetGroups
     }.
