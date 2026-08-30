-module(openapi_pinner_list_type).

-export([encode/1]).

-export_type([openapi_pinner_list_type/0]).

-type openapi_pinner_list_type() ::
    #{ 
     }.

encode(#{ 
        }) ->
    #{ 
     }.
