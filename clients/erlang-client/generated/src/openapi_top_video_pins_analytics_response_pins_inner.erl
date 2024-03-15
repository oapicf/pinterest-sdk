-module(openapi_top_video_pins_analytics_response_pins_inner).

-export([encode/1]).

-export_type([openapi_top_video_pins_analytics_response_pins_inner/0]).

-type openapi_top_video_pins_analytics_response_pins_inner() ::
    #{ 'metrics' => maps:map(),
       'data_status' => maps:map(),
       'pin_id' => binary()
     }.

encode(#{ 'metrics' := Metrics,
          'data_status' := DataStatus,
          'pin_id' := PinId
        }) ->
    #{ 'metrics' => Metrics,
       'data_status' => DataStatus,
       'pin_id' => PinId
     }.
