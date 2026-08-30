-module(openapi_auth_respond_invites_body_item).

-export([encode/1]).

-export_type([openapi_auth_respond_invites_body_item/0]).

-type openapi_auth_respond_invites_body_item() ::
    #{ 'action' := openapi_auth_respond_invite_action:openapi_auth_respond_invite_action(),
       'invite_id' := binary()
     }.

encode(#{ 'action' := Action,
          'invite_id' := InviteId
        }) ->
    #{ 'action' => Action,
       'invite_id' => InviteId
     }.
