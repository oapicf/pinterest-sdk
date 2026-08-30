-module(openapi_keywords).

-export([encode/1]).

-export_type([openapi_keywords/0]).

-type openapi_keywords() ::
    #{ 'errors' := list(),
       'keywords' := list()
     }.

encode(#{ 'errors' := Errors,
          'keywords' := Keywords
        }) ->
    #{ 'errors' => Errors,
       'keywords' => Keywords
     }.
