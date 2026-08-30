-module(openapi_collections_header_type).

-export([encode/1]).

-export_type([openapi_collections_header_type/0]).

-type openapi_collections_header_type() ::
    #{ 
     }.

encode(#{ 
        }) ->
    #{ 
     }.
