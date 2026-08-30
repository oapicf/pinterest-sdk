-module(openapi_top_video_pins_analytics_response_pins_items).

-include("openapi.hrl").

-export([openapi_top_video_pins_analytics_response_pins_items/0]).

-export([openapi_top_video_pins_analytics_response_pins_items/1]).

-export_type([openapi_top_video_pins_analytics_response_pins_items/0]).

-type openapi_top_video_pins_analytics_response_pins_items() ::
  [ {'data_status', map() }
  | {'metrics', map() }
  | {'pin_id', binary() }
  ].


openapi_top_video_pins_analytics_response_pins_items() ->
    openapi_top_video_pins_analytics_response_pins_items([]).

openapi_top_video_pins_analytics_response_pins_items(Fields) ->
  Default = [ {'data_status', map() }
            , {'metrics', map() }
            , {'pin_id', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

