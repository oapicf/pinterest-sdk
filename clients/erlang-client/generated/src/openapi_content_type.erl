-module(openapi_content_type).

-export([encode/1]).

-export_type([openapi_content_type/0]).

-type openapi_content_type() ::
    #{ 
     }.

encode(#{ 
        }) ->
    #{ 
     }.
