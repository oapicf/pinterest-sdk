-module(openapi_top_pins_analytics_response_date_availability).

-export([encode/1]).

-export_type([openapi_top_pins_analytics_response_date_availability/0]).

-type openapi_top_pins_analytics_response_date_availability() ::
    #{ 'latest_available_timestamp' => integer(),
       'is_realtime' => boolean()
     }.

encode(#{ 'latest_available_timestamp' := LatestAvailableTimestamp,
          'is_realtime' := IsRealtime
        }) ->
    #{ 'latest_available_timestamp' => LatestAvailableTimestamp,
       'is_realtime' => IsRealtime
     }.
