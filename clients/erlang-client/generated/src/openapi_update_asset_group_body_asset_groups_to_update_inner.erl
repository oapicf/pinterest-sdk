-module(openapi_update_asset_group_body_asset_groups_to_update_inner).

-export([encode/1]).

-export_type([openapi_update_asset_group_body_asset_groups_to_update_inner/0]).

-type openapi_update_asset_group_body_asset_groups_to_update_inner() ::
    #{ 'asset_group_id' := binary(),
       'asset_group_types' => list(),
       'assets_to_add' => list(),
       'assets_to_remove' => list(),
       'description' => binary(),
       'name' => binary()
     }.

encode(#{ 'asset_group_id' := AssetGroupId,
          'asset_group_types' := AssetGroupTypes,
          'assets_to_add' := AssetsToAdd,
          'assets_to_remove' := AssetsToRemove,
          'description' := Description,
          'name' := Name
        }) ->
    #{ 'asset_group_id' => AssetGroupId,
       'asset_group_types' => AssetGroupTypes,
       'assets_to_add' => AssetsToAdd,
       'assets_to_remove' => AssetsToRemove,
       'description' => Description,
       'name' => Name
     }.
