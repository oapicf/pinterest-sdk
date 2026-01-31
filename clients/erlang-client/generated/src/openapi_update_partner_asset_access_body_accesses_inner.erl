-module(openapi_update_partner_asset_access_body_accesses_inner).

-export([encode/1]).

-export_type([openapi_update_partner_asset_access_body_accesses_inner/0]).

-type openapi_update_partner_asset_access_body_accesses_inner() ::
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
