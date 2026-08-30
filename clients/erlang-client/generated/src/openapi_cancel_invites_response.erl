-module(openapi_cancel_invites_response).

-export([encode/1]).

-export_type([openapi_cancel_invites_response/0]).

-type openapi_cancel_invites_response() ::
    #{ 'items' => list()
     }.

encode(#{ 'items' := Items
        }) ->
    #{ 'items' => Items
     }.
