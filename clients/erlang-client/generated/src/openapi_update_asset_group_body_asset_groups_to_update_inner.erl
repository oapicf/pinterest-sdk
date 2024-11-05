-module(openapi_update_asset_group_body_asset_groups_to_update_inner).

-export([encode/1]).

-export_type([openapi_update_asset_group_body_asset_groups_to_update_inner/0]).

-type openapi_update_asset_group_body_asset_groups_to_update_inner() ::
    #{ 'asset_group_id' := binary(),
       'name' => binary(),
       'description' => binary(),
       'asset_group_types' => list(),
       'assets_to_add' => list(),
       'assets_to_remove' => list()
     }.

encode(#{ 'asset_group_id' := AssetGroupId,
          'name' := Name,
          'description' := Description,
          'asset_group_types' := AssetGroupTypes,
          'assets_to_add' := AssetsToAdd,
          'assets_to_remove' := AssetsToRemove
        }) ->
    #{ 'asset_group_id' => AssetGroupId,
       'name' => Name,
       'description' => Description,
       'asset_group_types' => AssetGroupTypes,
       'assets_to_add' => AssetsToAdd,
       'assets_to_remove' => AssetsToRemove
     }.
