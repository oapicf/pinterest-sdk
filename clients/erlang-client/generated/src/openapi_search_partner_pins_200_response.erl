-module(openapi_search_partner_pins_200_response).

-export([encode/1]).

-export_type([openapi_search_partner_pins_200_response/0]).

-type openapi_search_partner_pins_200_response() ::
    #{ 'bookmark' => binary(),
       'items' := list()
     }.

encode(#{ 'bookmark' := Bookmark,
          'items' := Items
        }) ->
    #{ 'bookmark' => Bookmark,
       'items' => Items
     }.
