-module(openapi_keywords_request).

-export([encode/1]).

-export_type([openapi_keywords_request/0]).

-type openapi_keywords_request() ::
    #{ 'keywords' := list(),
       'parent_id' := binary()
     }.

encode(#{ 'keywords' := Keywords,
          'parent_id' := ParentId
        }) ->
    #{ 'keywords' => Keywords,
       'parent_id' => ParentId
     }.
