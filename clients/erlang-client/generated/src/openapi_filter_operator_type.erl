-module(openapi_filter_operator_type).

-export([encode/1]).

-export_type([openapi_filter_operator_type/0]).

-type openapi_filter_operator_type() ::
    #{ 
     }.

encode(#{ 
        }) ->
    #{ 
     }.
