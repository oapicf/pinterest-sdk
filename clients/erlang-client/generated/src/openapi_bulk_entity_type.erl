-module(openapi_bulk_entity_type).

-export([encode/1]).

-export_type([openapi_bulk_entity_type/0]).

-type openapi_bulk_entity_type() ::
    #{ 
     }.

encode(#{ 
        }) ->
    #{ 
     }.
