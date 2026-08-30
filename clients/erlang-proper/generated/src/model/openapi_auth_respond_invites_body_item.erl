-module(openapi_auth_respond_invites_body_item).

-include("openapi.hrl").

-export([openapi_auth_respond_invites_body_item/0]).

-export([openapi_auth_respond_invites_body_item/1]).

-export_type([openapi_auth_respond_invites_body_item/0]).

-type openapi_auth_respond_invites_body_item() ::
  [ {'action', openapi_auth_respond_invite_action:openapi_auth_respond_invite_action() }
  | {'invite_id', binary() }
  ].


openapi_auth_respond_invites_body_item() ->
    openapi_auth_respond_invites_body_item([]).

openapi_auth_respond_invites_body_item(Fields) ->
  Default = [ {'action', openapi_auth_respond_invite_action:openapi_auth_respond_invite_action() }
            , {'invite_id', binary(1, 25) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

