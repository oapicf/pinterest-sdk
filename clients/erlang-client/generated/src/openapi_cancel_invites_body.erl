-module(openapi_cancel_invites_body).

-export([encode/1]).

-export_type([openapi_cancel_invites_body/0]).

-type openapi_cancel_invites_body() ::
    #{ 'invite_ids' := list()
     }.

encode(#{ 'invite_ids' := InviteIds
        }) ->
    #{ 'invite_ids' => InviteIds
     }.
