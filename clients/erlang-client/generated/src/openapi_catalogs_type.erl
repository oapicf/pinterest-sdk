-module(openapi_catalogs_type).

-export([encode/1]).

-export_type([openapi_catalogs_type/0]).

-type openapi_catalogs_type() ::
    #{ 
     }.

encode(#{ 
        }) ->
    #{ 
     }.
