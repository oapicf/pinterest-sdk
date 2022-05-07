-module(openapi_objective_type).

-export([encode/1]).

-export_type([openapi_objective_type/0]).

-type openapi_objective_type() ::
    #{ 
     }.

encode(#{ 
        }) ->
    #{ 
     }.
