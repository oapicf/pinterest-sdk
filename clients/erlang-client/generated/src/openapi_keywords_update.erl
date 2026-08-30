-module(openapi_keywords_update).

-export([encode/1]).

-export_type([openapi_keywords_update/0]).

-type openapi_keywords_update() ::
    #{ 'keywords' => list()
     }.

encode(#{ 'keywords' := Keywords
        }) ->
    #{ 'keywords' => Keywords
     }.
