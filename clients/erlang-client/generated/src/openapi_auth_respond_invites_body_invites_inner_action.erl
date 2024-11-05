-module(openapi_auth_respond_invites_body_invites_inner_action).

-export([encode/1]).

-export_type([openapi_auth_respond_invites_body_invites_inner_action/0]).

-type openapi_auth_respond_invites_body_invites_inner_action() ::
    #{ 'accept_invite' := boolean(),
       'asset_id_to_permissions' => maps:map()
     }.

encode(#{ 'accept_invite' := AcceptInvite,
          'asset_id_to_permissions' := AssetIdToPermissions
        }) ->
    #{ 'accept_invite' => AcceptInvite,
       'asset_id_to_permissions' => AssetIdToPermissions
     }.
