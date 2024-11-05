-module(openapi_auth_respond_invites_body_invites_inner).

-export([encode/1]).

-export_type([openapi_auth_respond_invites_body_invites_inner/0]).

-type openapi_auth_respond_invites_body_invites_inner() ::
    #{ 'action' := openapi_auth_respond_invites_body_invites_inner_action:openapi_auth_respond_invites_body_invites_inner_action(),
       'invite_id' := binary()
     }.

encode(#{ 'action' := Action,
          'invite_id' := InviteId
        }) ->
    #{ 'action' => Action,
       'invite_id' => InviteId
     }.
