-module(openapi_ssio_order_lines_get_by_ad_account_200_response).

-export([encode/1]).

-export_type([openapi_ssio_order_lines_get_by_ad_account_200_response/0]).

-type openapi_ssio_order_lines_get_by_ad_account_200_response() ::
    #{ 'bookmark' => binary(),
       'items' := list()
     }.

encode(#{ 'bookmark' := Bookmark,
          'items' := Items
        }) ->
    #{ 'bookmark' => Bookmark,
       'items' => Items
     }.
