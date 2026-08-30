-module(openapi_update_partner_asset_access_item).

-export([encode/1]).

-export_type([openapi_update_partner_asset_access_item/0]).

-type openapi_update_partner_asset_access_item() ::
    #{ 'asset_id' := binary(),
       'partner_id' := binary(),
       'permissions' := list()
     }.

encode(#{ 'asset_id' := AssetId,
          'partner_id' := PartnerId,
          'permissions' := Permissions
        }) ->
    #{ 'asset_id' => AssetId,
       'partner_id' => PartnerId,
       'permissions' => Permissions
     }.
