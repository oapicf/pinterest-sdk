-module(openapi_get_partner_assets_response).

-export([encode/1]).

-export_type([openapi_get_partner_assets_response/0]).

-type openapi_get_partner_assets_response() ::
    #{ 'asset_group_info' => openapi_asset_group_binding:openapi_asset_group_binding(),
       'asset_id' => binary(),
       'asset_type' => binary(),
       'permissions' => list()
     }.

encode(#{ 'asset_group_info' := AssetGroupInfo,
          'asset_id' := AssetId,
          'asset_type' := AssetType,
          'permissions' := Permissions
        }) ->
    #{ 'asset_group_info' => AssetGroupInfo,
       'asset_id' => AssetId,
       'asset_type' => AssetType,
       'permissions' => Permissions
     }.
