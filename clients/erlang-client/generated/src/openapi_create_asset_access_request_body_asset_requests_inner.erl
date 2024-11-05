-module(openapi_create_asset_access_request_body_asset_requests_inner).

-export([encode/1]).

-export_type([openapi_create_asset_access_request_body_asset_requests_inner/0]).

-type openapi_create_asset_access_request_body_asset_requests_inner() ::
    #{ 'partner_id' := binary(),
       'asset_id_to_permissions' := maps:map()
     }.

encode(#{ 'partner_id' := PartnerId,
          'asset_id_to_permissions' := AssetIdToPermissions
        }) ->
    #{ 'partner_id' => PartnerId,
       'asset_id_to_permissions' => AssetIdToPermissions
     }.
