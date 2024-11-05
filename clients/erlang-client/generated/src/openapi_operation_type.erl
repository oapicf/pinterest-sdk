-module(openapi_operation_type).

-export([encode/1]).

-export_type([openapi_operation_type/0]).

-type openapi_operation_type() ::
    #{ 
     }.

encode(#{ 
        }) ->
    #{ 
     }.
