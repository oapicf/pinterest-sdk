-module(openapi_asset_group_input_create).

-export([encode/1]).

-export_type([openapi_asset_group_input_create/0]).

-type openapi_asset_group_input_create() ::
    #{ 'asset_group' => openapi_asset_group_binding:openapi_asset_group_binding(),
       'asset_group_description' := binary(),
       'asset_group_name' := binary(),
       'asset_group_types' := list()
     }.

encode(#{ 'asset_group' := AssetGroup,
          'asset_group_description' := AssetGroupDescription,
          'asset_group_name' := AssetGroupName,
          'asset_group_types' := AssetGroupTypes
        }) ->
    #{ 'asset_group' => AssetGroup,
       'asset_group_description' => AssetGroupDescription,
       'asset_group_name' => AssetGroupName,
       'asset_group_types' => AssetGroupTypes
     }.
