-module(openapi_create_asset_group_body).

-export([encode/1]).

-export_type([openapi_create_asset_group_body/0]).

-type openapi_create_asset_group_body() ::
    #{ 'asset_group_name' := binary(),
       'asset_group_description' := binary(),
       'asset_group_types' := list()
     }.

encode(#{ 'asset_group_name' := AssetGroupName,
          'asset_group_description' := AssetGroupDescription,
          'asset_group_types' := AssetGroupTypes
        }) ->
    #{ 'asset_group_name' => AssetGroupName,
       'asset_group_description' => AssetGroupDescription,
       'asset_group_types' => AssetGroupTypes
     }.
