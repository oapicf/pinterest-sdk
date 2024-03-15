-module(openapi_country).

-export([encode/1]).

-export_type([openapi_country/0]).

-type openapi_country() ::
    #{ 
     }.

encode(#{ 
        }) ->
    #{ 
     }.
