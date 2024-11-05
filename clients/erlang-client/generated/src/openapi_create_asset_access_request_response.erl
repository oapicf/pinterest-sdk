-module(openapi_create_asset_access_request_response).

-export([encode/1]).

-export_type([openapi_create_asset_access_request_response/0]).

-type openapi_create_asset_access_request_response() ::
    #{ 'exceptions' => list(),
       'invites' => maps:map()
     }.

encode(#{ 'exceptions' := Exceptions,
          'invites' := Invites
        }) ->
    #{ 'exceptions' => Exceptions,
       'invites' => Invites
     }.
