-module(openapi_top_video_pins_analytics_response_pins_inner).

-include("openapi.hrl").

-export([openapi_top_video_pins_analytics_response_pins_inner/0]).

-export([openapi_top_video_pins_analytics_response_pins_inner/1]).

-export_type([openapi_top_video_pins_analytics_response_pins_inner/0]).

-type openapi_top_video_pins_analytics_response_pins_inner() ::
  [ {'metrics', map() }
  | {'data_status', map() }
  | {'pin_id', binary() }
  ].


openapi_top_video_pins_analytics_response_pins_inner() ->
    openapi_top_video_pins_analytics_response_pins_inner([]).

openapi_top_video_pins_analytics_response_pins_inner(Fields) ->
  Default = [ {'metrics', map() }
            , {'data_status', map() }
            , {'pin_id', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

