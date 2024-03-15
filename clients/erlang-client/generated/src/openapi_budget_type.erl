-module(openapi_budget_type).

-export([encode/1]).

-export_type([openapi_budget_type/0]).

-type openapi_budget_type() ::
    #{ 
     }.

encode(#{ 
        }) ->
    #{ 
     }.
