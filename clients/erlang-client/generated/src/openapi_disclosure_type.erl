-module(openapi_disclosure_type).

-export([encode/1]).

-export_type([openapi_disclosure_type/0]).

-type openapi_disclosure_type() ::
    #{ 
     }.

encode(#{ 
        }) ->
    #{ 
     }.
