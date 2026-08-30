-module(openapi_auth_respond_invite_action).

-include("openapi.hrl").

-export([openapi_auth_respond_invite_action/0]).

-export([openapi_auth_respond_invite_action/1]).

-export_type([openapi_auth_respond_invite_action/0]).

-type openapi_auth_respond_invite_action() ::
  [ {'accept_invite', boolean() }
  | {'asset_id_to_permissions', map() }
  ].


openapi_auth_respond_invite_action() ->
    openapi_auth_respond_invite_action([]).

openapi_auth_respond_invite_action(Fields) ->
  Default = [ {'accept_invite', boolean() }
            , {'asset_id_to_permissions', map() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

