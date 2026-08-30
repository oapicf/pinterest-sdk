-module(openapi_nullable_label_type).

-export([encode/1]).

-export_type([openapi_nullable_label_type/0]).

-type openapi_nullable_label_type() ::
    #{ 
     }.

encode(#{ 
        }) ->
    #{ 
     }.
