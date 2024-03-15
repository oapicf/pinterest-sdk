-module(openapi_match_type).

-export([encode/1]).

-export_type([openapi_match_type/0]).

-type openapi_match_type() ::
    #{ 
     }.

encode(#{ 
        }) ->
    #{ 
     }.
