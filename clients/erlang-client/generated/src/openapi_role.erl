-module(openapi_role).

-export([encode/1]).

-export_type([openapi_role/0]).

-type openapi_role() ::
    #{ 
     }.

encode(#{ 
        }) ->
    #{ 
     }.
