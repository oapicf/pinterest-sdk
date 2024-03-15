-module(openapi_keyword_update_body).

-export([encode/1]).

-export_type([openapi_keyword_update_body/0]).

-type openapi_keyword_update_body() ::
    #{ 'keywords' := list()
     }.

encode(#{ 'keywords' := Keywords
        }) ->
    #{ 'keywords' => Keywords
     }.
