-module(openapi_update_partner_asset_access_body_accesses_inner).

-export([encode/1]).

-export_type([openapi_update_partner_asset_access_body_accesses_inner/0]).

-type openapi_update_partner_asset_access_body_accesses_inner() ::
    #{ 'partner_id' := binary(),
       'asset_id' := binary(),
       'permissions' := list()
     }.

encode(#{ 'partner_id' := PartnerId,
          'asset_id' := AssetId,
          'permissions' := Permissions
        }) ->
    #{ 'partner_id' => PartnerId,
       'asset_id' => AssetId,
       'permissions' => Permissions
     }.
