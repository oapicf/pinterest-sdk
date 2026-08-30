-module(openapi_top_video_pins_sort_by).

-include("openapi.hrl").

-export([openapi_top_video_pins_sort_by/0]).

-export_type([openapi_top_video_pins_sort_by/0]).

-type openapi_top_video_pins_sort_by() ::
  binary().

openapi_top_video_pins_sort_by() ->
  elements([<<"SAVE">>, <<"IMPRESSION">>, <<"OUTBOUND_CLICK">>, <<"VIDEO_MRC_VIEW">>, <<"VIDEO_AVG_WATCH_TIME">>, <<"VIDEO_V50_WATCH_TIME">>, <<"QUARTILE_95_PERCENT_VIEW">>, <<"VIDEO_10S_VIEW">>, <<"VIDEO_START">>]).

