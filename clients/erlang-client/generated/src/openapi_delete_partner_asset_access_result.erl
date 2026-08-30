-module(openapi_delete_partner_asset_access_result).

-export([encode/1]).

-export_type([openapi_delete_partner_asset_access_result/0]).

-type openapi_delete_partner_asset_access_result() ::
    #{ 'asset_id' => binary(),
       'asset_type' => binary(),
       'is_shared_partner' => boolean(),
       'partner_id' => binary(),
       'permissions' => list()
     }.

encode(#{ 'asset_id' := AssetId,
          'asset_type' := AssetType,
          'is_shared_partner' := IsSharedPartner,
          'partner_id' := PartnerId,
          'permissions' := Permissions
        }) ->
    #{ 'asset_id' => AssetId,
       'asset_type' => AssetType,
       'is_shared_partner' => IsSharedPartner,
       'partner_id' => PartnerId,
       'permissions' => Permissions
     }.
