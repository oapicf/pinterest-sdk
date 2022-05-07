-module(openapi_action_type).

-export([encode/1]).

-export_type([openapi_action_type/0]).

-type openapi_action_type() ::
    #{ 
     }.

encode(#{ 
        }) ->
    #{ 
     }.
