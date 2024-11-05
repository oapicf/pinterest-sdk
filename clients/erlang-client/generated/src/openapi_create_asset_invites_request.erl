-module(openapi_create_asset_invites_request).

-export([encode/1]).

-export_type([openapi_create_asset_invites_request/0]).

-type openapi_create_asset_invites_request() ::
    #{ 'invites' := list()
     }.

encode(#{ 'invites' := Invites
        }) ->
    #{ 'invites' => Invites
     }.
