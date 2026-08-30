-module(openapi_network_type).

-export([encode/1]).

-export_type([openapi_network_type/0]).

-type openapi_network_type() ::
    #{ 
     }.

encode(#{ 
        }) ->
    #{ 
     }.
