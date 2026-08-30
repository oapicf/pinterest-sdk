-module(openapi_token_type_hint).

-export([encode/1]).

-export_type([openapi_token_type_hint/0]).

-type openapi_token_type_hint() ::
    #{ 
     }.

encode(#{ 
        }) ->
    #{ 
     }.
