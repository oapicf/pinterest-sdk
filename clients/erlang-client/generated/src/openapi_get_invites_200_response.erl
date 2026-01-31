-module(openapi_get_invites_200_response).

-export([encode/1]).

-export_type([openapi_get_invites_200_response/0]).

-type openapi_get_invites_200_response() ::
    #{ 'bookmark' => binary(),
       'items' := list()
     }.

encode(#{ 'bookmark' := Bookmark,
          'items' := Items
        }) ->
    #{ 'bookmark' => Bookmark,
       'items' => Items
     }.
