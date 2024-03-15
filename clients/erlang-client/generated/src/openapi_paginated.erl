-module(openapi_paginated).

-export([encode/1]).

-export_type([openapi_paginated/0]).

-type openapi_paginated() ::
    #{ 'items' := list(),
       'bookmark' => binary()
     }.

encode(#{ 'items' := Items,
          'bookmark' := Bookmark
        }) ->
    #{ 'items' => Items,
       'bookmark' => Bookmark
     }.
