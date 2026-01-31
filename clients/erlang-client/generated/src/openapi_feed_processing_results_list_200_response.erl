-module(openapi_feed_processing_results_list_200_response).

-export([encode/1]).

-export_type([openapi_feed_processing_results_list_200_response/0]).

-type openapi_feed_processing_results_list_200_response() ::
    #{ 'bookmark' => binary(),
       'items' := list()
     }.

encode(#{ 'bookmark' := Bookmark,
          'items' := Items
        }) ->
    #{ 'bookmark' => Bookmark,
       'items' => Items
     }.
