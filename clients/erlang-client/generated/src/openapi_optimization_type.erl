-module(openapi_optimization_type).

-export([encode/1]).

-export_type([openapi_optimization_type/0]).

-type openapi_optimization_type() ::
    #{ 
     }.

encode(#{ 
        }) ->
    #{ 
     }.
