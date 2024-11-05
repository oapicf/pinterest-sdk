-module(openapi_permissions).

-export([encode/1]).

-export_type([openapi_permissions/0]).

-type openapi_permissions() ::
    #{ 
     }.

encode(#{ 
        }) ->
    #{ 
     }.
