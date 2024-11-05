-module(openapi_create_membership_or_partnership_invites_body).

-include("openapi.hrl").

-export([openapi_create_membership_or_partnership_invites_body/0]).

-export([openapi_create_membership_or_partnership_invites_body/1]).

-export_type([openapi_create_membership_or_partnership_invites_body/0]).

-type openapi_create_membership_or_partnership_invites_body() ::
  [ {'business_role', binary() }
  | {'invite_type', openapi_invite_type:openapi_invite_type() }
  | {'members', list(binary()) }
  | {'partners', list(binary()) }
  ].


openapi_create_membership_or_partnership_invites_body() ->
    openapi_create_membership_or_partnership_invites_body([]).

openapi_create_membership_or_partnership_invites_body(Fields) ->
  Default = [ {'business_role', elements([<<"EMPLOYEE">>, <<"BIZ_ADMIN">>, <<"PARTNER">>]) }
            , {'invite_type', openapi_invite_type:openapi_invite_type() }
            , {'members', list(binary(), 1, 50) }
            , {'partners', list(binary(), 1, 50) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

