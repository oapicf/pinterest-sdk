-module(openapi_catalogs_format).

-export([encode/1]).

-export_type([openapi_catalogs_format/0]).

-type openapi_catalogs_format() ::
    #{ 
     }.

encode(#{ 
        }) ->
    #{ 
     }.
