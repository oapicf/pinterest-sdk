-module(openapi_label_parent_type).

-export([encode/1]).

-export_type([openapi_label_parent_type/0]).

-type openapi_label_parent_type() ::
    #{ 
     }.

encode(#{ 
        }) ->
    #{ 
     }.
