-module(openapi_search_user_boards_get_200_response).

-export([encode/1]).

-export_type([openapi_search_user_boards_get_200_response/0]).

-type openapi_search_user_boards_get_200_response() ::
    #{ 'bookmark' => binary(),
       'items' := list()
     }.

encode(#{ 'bookmark' := Bookmark,
          'items' := Items
        }) ->
    #{ 'bookmark' => Bookmark,
       'items' => Items
     }.
