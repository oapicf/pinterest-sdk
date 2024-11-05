-module(openapi_auth_respond_invites_body).

-include("openapi.hrl").

-export([openapi_auth_respond_invites_body/0]).

-export([openapi_auth_respond_invites_body/1]).

-export_type([openapi_auth_respond_invites_body/0]).

-type openapi_auth_respond_invites_body() ::
  [ {'invites', list(openapi_auth_respond_invites_body_invites_inner:openapi_auth_respond_invites_body_invites_inner()) }
  ].


openapi_auth_respond_invites_body() ->
    openapi_auth_respond_invites_body([]).

openapi_auth_respond_invites_body(Fields) ->
  Default = [ {'invites', list(openapi_auth_respond_invites_body_invites_inner:openapi_auth_respond_invites_body_invites_inner(), 1, 100) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

