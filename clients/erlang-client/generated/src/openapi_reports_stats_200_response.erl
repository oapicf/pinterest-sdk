-module(openapi_reports_stats_200_response).

-export([encode/1]).

-export_type([openapi_reports_stats_200_response/0]).

-type openapi_reports_stats_200_response() ::
    #{ 'items' := list(),
       'bookmark' => binary()
     }.

encode(#{ 'items' := Items,
          'bookmark' := Bookmark
        }) ->
    #{ 'items' => Items,
       'bookmark' => Bookmark
     }.
