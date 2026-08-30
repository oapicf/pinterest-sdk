-module(openapi_cancel_invites_request).

-export([encode/1]).

-export_type([openapi_cancel_invites_request/0]).

-type openapi_cancel_invites_request() ::
    #{ 'invite_ids' := list()
     }.

encode(#{ 'invite_ids' := InviteIds
        }) ->
    #{ 'invite_ids' => InviteIds
     }.
