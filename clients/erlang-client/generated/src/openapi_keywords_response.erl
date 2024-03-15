-module(openapi_keywords_response).

-export([encode/1]).

-export_type([openapi_keywords_response/0]).

-type openapi_keywords_response() ::
    #{ 'errors' => list(),
       'keywords' => list()
     }.

encode(#{ 'errors' := Errors,
          'keywords' := Keywords
        }) ->
    #{ 'errors' => Errors,
       'keywords' => Keywords
     }.
