-module(openapi_top_video_pins_analytics_response).

-export([encode/1]).

-export_type([openapi_top_video_pins_analytics_response/0]).

-type openapi_top_video_pins_analytics_response() ::
    #{ 'date_availability' => openapi_top_video_pins_analytics_response_date_availability:openapi_top_video_pins_analytics_response_date_availability(),
       'pins' => list(),
       'sort_by' => openapi_top_video_pins_sort_by:openapi_top_video_pins_sort_by()
     }.

encode(#{ 'date_availability' := DateAvailability,
          'pins' := Pins,
          'sort_by' := SortBy
        }) ->
    #{ 'date_availability' => DateAvailability,
       'pins' => Pins,
       'sort_by' => SortBy
     }.
