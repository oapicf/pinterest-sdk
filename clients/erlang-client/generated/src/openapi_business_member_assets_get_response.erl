-module(openapi_business_member_assets_get_response).

-export([encode/1]).

-export_type([openapi_business_member_assets_get_response/0]).

-type openapi_business_member_assets_get_response() ::
    #{ 'bookmark' => binary(),
       'items' := list(),
       'total_data_count' := integer(),
       'total_data_count_by_status' => openapi_total_count_by_entity_status:openapi_total_count_by_entity_status()
     }.

encode(#{ 'bookmark' := Bookmark,
          'items' := Items,
          'total_data_count' := TotalDataCount,
          'total_data_count_by_status' := TotalDataCountByStatus
        }) ->
    #{ 'bookmark' => Bookmark,
       'items' => Items,
       'total_data_count' => TotalDataCount,
       'total_data_count_by_status' => TotalDataCountByStatus
     }.
