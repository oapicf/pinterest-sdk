-module(openapi_create_asset_access_request_item).

-export([encode/1]).

-export_type([openapi_create_asset_access_request_item/0]).

-type openapi_create_asset_access_request_item() ::
    #{ 'asset_id_to_permissions' := maps:map(),
       'partner_id' := binary()
     }.

encode(#{ 'asset_id_to_permissions' := AssetIdToPermissions,
          'partner_id' := PartnerId
        }) ->
    #{ 'asset_id_to_permissions' => AssetIdToPermissions,
       'partner_id' => PartnerId
     }.
