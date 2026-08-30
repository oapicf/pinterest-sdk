-module(openapi_http_method).

-export([encode/1]).

-export_type([openapi_http_method/0]).

-type openapi_http_method() ::
    #{ 
     }.

encode(#{ 
        }) ->
    #{ 
     }.
