-module(openapi_top_pins_analytics_response_date_availability).

-export([encode/1]).

-export_type([openapi_top_pins_analytics_response_date_availability/0]).

-type openapi_top_pins_analytics_response_date_availability() ::
    #{ 'is_realtime' => boolean(),
       'latest_available_timestamp' => integer()
     }.

encode(#{ 'is_realtime' := IsRealtime,
          'latest_available_timestamp' := LatestAvailableTimestamp
        }) ->
    #{ 'is_realtime' => IsRealtime,
       'latest_available_timestamp' => LatestAvailableTimestamp
     }.
