-module(openapi_business_assets).

-export([encode/1]).

-export_type([openapi_business_assets/0]).

-type openapi_business_assets() ::
    #{ 'asset_group_info' => openapi_asset_group_binding:openapi_asset_group_binding(),
       'asset_id' => binary(),
       'asset_type' => openapi_asset_type_response:openapi_asset_type_response(),
       'permissions' => list(),
       'catalog_info' => openapi_catalog_binding:openapi_catalog_binding()
     }.

encode(#{ 'asset_group_info' := AssetGroupInfo,
          'asset_id' := AssetId,
          'asset_type' := AssetType,
          'permissions' := Permissions,
          'catalog_info' := CatalogInfo
        }) ->
    #{ 'asset_group_info' => AssetGroupInfo,
       'asset_id' => AssetId,
       'asset_type' => AssetType,
       'permissions' => Permissions,
       'catalog_info' => CatalogInfo
     }.
