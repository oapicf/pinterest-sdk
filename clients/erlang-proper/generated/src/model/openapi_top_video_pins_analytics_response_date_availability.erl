-module(openapi_top_video_pins_analytics_response_date_availability).

-include("openapi.hrl").

-export([openapi_top_video_pins_analytics_response_date_availability/0]).

-export([openapi_top_video_pins_analytics_response_date_availability/1]).

-export_type([openapi_top_video_pins_analytics_response_date_availability/0]).

-type openapi_top_video_pins_analytics_response_date_availability() ::
  [ {'is_realtime', boolean() }
  | {'latest_available_timestamp', integer() }
  ].


openapi_top_video_pins_analytics_response_date_availability() ->
    openapi_top_video_pins_analytics_response_date_availability([]).

openapi_top_video_pins_analytics_response_date_availability(Fields) ->
  Default = [ {'is_realtime', boolean() }
            , {'latest_available_timestamp', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

