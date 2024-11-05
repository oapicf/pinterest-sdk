-module(openapi_update_partner_assets_result).

-export([encode/1]).

-export_type([openapi_update_partner_assets_result/0]).

-type openapi_update_partner_assets_result() ::
    #{ 'asset_id' => binary(),
       'asset_type' => binary(),
       'partner_id' => binary(),
       'permissions' => list()
     }.

encode(#{ 'asset_id' := AssetId,
          'asset_type' := AssetType,
          'partner_id' := PartnerId,
          'permissions' := Permissions
        }) ->
    #{ 'asset_id' => AssetId,
       'asset_type' => AssetType,
       'partner_id' => PartnerId,
       'permissions' => Permissions
     }.
