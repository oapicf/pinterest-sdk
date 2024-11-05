-module(openapi_auth_respond_invites_body).

-export([encode/1]).

-export_type([openapi_auth_respond_invites_body/0]).

-type openapi_auth_respond_invites_body() ::
    #{ 'invites' := list()
     }.

encode(#{ 'invites' := Invites
        }) ->
    #{ 'invites' => Invites
     }.
