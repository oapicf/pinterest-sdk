-module(openapi_top_video_pins_analytics_response).

-include("openapi.hrl").

-export([openapi_top_video_pins_analytics_response/0]).

-export([openapi_top_video_pins_analytics_response/1]).

-export_type([openapi_top_video_pins_analytics_response/0]).

-type openapi_top_video_pins_analytics_response() ::
  [ {'date_availability', openapi_top_pins_analytics_response_date_availability:openapi_top_pins_analytics_response_date_availability() }
  | {'pins', list(openapi_top_video_pins_analytics_response_pins_inner:openapi_top_video_pins_analytics_response_pins_inner()) }
  | {'sort_by', binary() }
  ].


openapi_top_video_pins_analytics_response() ->
    openapi_top_video_pins_analytics_response([]).

openapi_top_video_pins_analytics_response(Fields) ->
  Default = [ {'date_availability', openapi_top_pins_analytics_response_date_availability:openapi_top_pins_analytics_response_date_availability() }
            , {'pins', list(openapi_top_video_pins_analytics_response_pins_inner:openapi_top_video_pins_analytics_response_pins_inner()) }
            , {'sort_by', elements([<<"SAVE">>, <<"IMPRESSION">>, <<"OUTBOUND_CLICK">>, <<"VIDEO_MRC_VIEW">>, <<"VIDEO_AVG_WATCH_TIME">>, <<"VIDEO_V50_WATCH_TIME">>, <<"QUARTILE_95_PERCENT_VIEW">>, <<"VIDEO_10S_VIEW">>, <<"VIDEO_START">>]) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

