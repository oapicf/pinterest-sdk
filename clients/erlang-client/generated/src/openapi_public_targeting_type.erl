-module(openapi_public_targeting_type).

-export([encode/1]).

-export_type([openapi_public_targeting_type/0]).

-type openapi_public_targeting_type() ::
    #{ 
     }.

encode(#{ 
        }) ->
    #{ 
     }.
