-module(openapi_auth_respond_invites_body_invites_inner).

-include("openapi.hrl").

-export([openapi_auth_respond_invites_body_invites_inner/0]).

-export([openapi_auth_respond_invites_body_invites_inner/1]).

-export_type([openapi_auth_respond_invites_body_invites_inner/0]).

-type openapi_auth_respond_invites_body_invites_inner() ::
  [ {'action', openapi_auth_respond_invites_body_invites_inner_action:openapi_auth_respond_invites_body_invites_inner_action() }
  | {'invite_id', binary() }
  ].


openapi_auth_respond_invites_body_invites_inner() ->
    openapi_auth_respond_invites_body_invites_inner([]).

openapi_auth_respond_invites_body_invites_inner(Fields) ->
  Default = [ {'action', openapi_auth_respond_invites_body_invites_inner_action:openapi_auth_respond_invites_body_invites_inner_action() }
            , {'invite_id', binary(1, 25) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

