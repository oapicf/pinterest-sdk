-module(openapi_order).

-export([encode/1]).

-export_type([openapi_order/0]).

-type openapi_order() ::
    #{ 
     }.

encode(#{ 
        }) ->
    #{ 
     }.
