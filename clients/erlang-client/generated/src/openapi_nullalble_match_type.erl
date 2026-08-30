-module(openapi_nullalble_match_type).

-export([encode/1]).

-export_type([openapi_nullalble_match_type/0]).

-type openapi_nullalble_match_type() ::
    #{ 
     }.

encode(#{ 
        }) ->
    #{ 
     }.
