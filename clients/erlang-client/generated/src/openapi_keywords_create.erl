-module(openapi_keywords_create).

-export([encode/1]).

-export_type([openapi_keywords_create/0]).

-type openapi_keywords_create() ::
    #{ 'keywords' := list(),
       'parent_id' := binary()
     }.

encode(#{ 'keywords' := Keywords,
          'parent_id' := ParentId
        }) ->
    #{ 'keywords' => Keywords,
       'parent_id' => ParentId
     }.
