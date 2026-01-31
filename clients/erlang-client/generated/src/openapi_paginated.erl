-module(openapi_paginated).

-export([encode/1]).

-export_type([openapi_paginated/0]).

-type openapi_paginated() ::
    #{ 'bookmark' => binary(),
       'items' := list()
     }.

encode(#{ 'bookmark' := Bookmark,
          'items' := Items
        }) ->
    #{ 'bookmark' => Bookmark,
       'items' => Items
     }.
