-module(openapi_pin_type).

-export([encode/1]).

-export_type([openapi_pin_type/0]).

-type openapi_pin_type() ::
    #{ 
     }.

encode(#{ 
        }) ->
    #{ 
     }.
