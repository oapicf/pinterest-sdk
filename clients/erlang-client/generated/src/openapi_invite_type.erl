-module(openapi_invite_type).

-export([encode/1]).

-export_type([openapi_invite_type/0]).

-type openapi_invite_type() ::
    #{ 
     }.

encode(#{ 
        }) ->
    #{ 
     }.
