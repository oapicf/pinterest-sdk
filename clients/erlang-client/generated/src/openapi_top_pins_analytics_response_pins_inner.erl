-module(openapi_top_pins_analytics_response_pins_inner).

-export([encode/1]).

-export_type([openapi_top_pins_analytics_response_pins_inner/0]).

-type openapi_top_pins_analytics_response_pins_inner() ::
    #{ 'data_status' => maps:map(),
       'metrics' => maps:map(),
       'pin_id' => binary()
     }.

encode(#{ 'data_status' := DataStatus,
          'metrics' := Metrics,
          'pin_id' := PinId
        }) ->
    #{ 'data_status' => DataStatus,
       'metrics' => Metrics,
       'pin_id' => PinId
     }.
