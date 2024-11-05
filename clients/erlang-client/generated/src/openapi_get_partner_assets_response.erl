-module(openapi_get_partner_assets_response).

-export([encode/1]).

-export_type([openapi_get_partner_assets_response/0]).

-type openapi_get_partner_assets_response() ::
    #{ 'asset_id' => binary(),
       'asset_type' => binary(),
       'permissions' => list(),
       'asset_group_info' => openapi_asset_group_binding:openapi_asset_group_binding()
     }.

encode(#{ 'asset_id' := AssetId,
          'asset_type' := AssetType,
          'permissions' := Permissions,
          'asset_group_info' := AssetGroupInfo
        }) ->
    #{ 'asset_id' => AssetId,
       'asset_type' => AssetType,
       'permissions' => Permissions,
       'asset_group_info' => AssetGroupInfo
     }.
