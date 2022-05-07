-module(openapi_nullable_currency).

-export([encode/1]).

-export_type([openapi_nullable_currency/0]).

-type openapi_nullable_currency() ::
    #{ 
     }.

encode(#{ 
        }) ->
    #{ 
     }.
