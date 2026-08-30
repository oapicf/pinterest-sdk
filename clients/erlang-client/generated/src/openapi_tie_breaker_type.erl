-module(openapi_tie_breaker_type).

-export([encode/1]).

-export_type([openapi_tie_breaker_type/0]).

-type openapi_tie_breaker_type() ::
    #{ 
     }.

encode(#{ 
        }) ->
    #{ 
     }.
