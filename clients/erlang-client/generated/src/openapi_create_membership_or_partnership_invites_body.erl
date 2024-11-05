-module(openapi_create_membership_or_partnership_invites_body).

-export([encode/1]).

-export_type([openapi_create_membership_or_partnership_invites_body/0]).

-type openapi_create_membership_or_partnership_invites_body() ::
    #{ 'business_role' := binary(),
       'invite_type' := openapi_invite_type:openapi_invite_type(),
       'members' => list(),
       'partners' => list()
     }.

encode(#{ 'business_role' := BusinessRole,
          'invite_type' := InviteType,
          'members' := Members,
          'partners' := Partners
        }) ->
    #{ 'business_role' => BusinessRole,
       'invite_type' => InviteType,
       'members' => Members,
       'partners' => Partners
     }.
