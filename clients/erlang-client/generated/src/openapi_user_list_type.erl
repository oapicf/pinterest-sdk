-module(openapi_user_list_type).

-export([encode/1]).

-export_type([openapi_user_list_type/0]).

-type openapi_user_list_type() ::
    #{ 
     }.

encode(#{ 
        }) ->
    #{ 
     }.
