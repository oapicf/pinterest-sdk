-module(openapi_get_business_partners_200_response).

-export([encode/1]).

-export_type([openapi_get_business_partners_200_response/0]).

-type openapi_get_business_partners_200_response() ::
    #{ 'items' := list(),
       'bookmark' => binary()
     }.

encode(#{ 'items' := Items,
          'bookmark' := Bookmark
        }) ->
    #{ 'items' => Items,
       'bookmark' => Bookmark
     }.
