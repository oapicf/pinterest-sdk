-module(openapi_business_assets_get_200_response).

-export([encode/1]).

-export_type([openapi_business_assets_get_200_response/0]).

-type openapi_business_assets_get_200_response() ::
    #{ 'items' := list(),
       'bookmark' => binary()
     }.

encode(#{ 'items' := Items,
          'bookmark' := Bookmark
        }) ->
    #{ 'items' => Items,
       'bookmark' => Bookmark
     }.
