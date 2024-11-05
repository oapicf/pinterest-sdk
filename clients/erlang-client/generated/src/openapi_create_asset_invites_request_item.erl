-module(openapi_create_asset_invites_request_item).

-export([encode/1]).

-export_type([openapi_create_asset_invites_request_item/0]).

-type openapi_create_asset_invites_request_item() ::
    #{ 'invite_id' := binary(),
       'invite_type' := openapi_invite_type:openapi_invite_type(),
       'asset_id_to_permissions' := maps:map()
     }.

encode(#{ 'invite_id' := InviteId,
          'invite_type' := InviteType,
          'asset_id_to_permissions' := AssetIdToPermissions
        }) ->
    #{ 'invite_id' => InviteId,
       'invite_type' => InviteType,
       'asset_id_to_permissions' => AssetIdToPermissions
     }.
