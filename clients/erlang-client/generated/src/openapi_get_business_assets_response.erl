-module(openapi_get_business_assets_response).

-export([encode/1]).

-export_type([openapi_get_business_assets_response/0]).

-type openapi_get_business_assets_response() ::
    #{ 'asset_group_info' => openapi_asset_group_binding:openapi_asset_group_binding(),
       'asset_id' => binary(),
       'asset_type' => binary(),
       'catalog_info' => openapi_get_business_assets_response_catalog_info:openapi_get_business_assets_response_catalog_info()
     }.

encode(#{ 'asset_group_info' := AssetGroupInfo,
          'asset_id' := AssetId,
          'asset_type' := AssetType,
          'catalog_info' := CatalogInfo
        }) ->
    #{ 'asset_group_info' => AssetGroupInfo,
       'asset_id' => AssetId,
       'asset_type' => AssetType,
       'catalog_info' => CatalogInfo
     }.
