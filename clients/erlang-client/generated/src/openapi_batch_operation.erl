-module(openapi_batch_operation).

-export([encode/1]).

-export_type([openapi_batch_operation/0]).

-type openapi_batch_operation() ::
    #{ 
     }.

encode(#{ 
        }) ->
    #{ 
     }.
