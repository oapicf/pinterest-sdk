-module(openapi_catalogs_list_200_response).

-export([encode/1]).

-export_type([openapi_catalogs_list_200_response/0]).

-type openapi_catalogs_list_200_response() ::
    #{ 'items' := list(),
       'bookmark' => binary()
     }.

encode(#{ 'items' := Items,
          'bookmark' := Bookmark
        }) ->
    #{ 'items' => Items,
       'bookmark' => Bookmark
     }.
