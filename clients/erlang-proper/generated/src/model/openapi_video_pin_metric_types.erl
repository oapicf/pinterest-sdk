-module(openapi_video_pin_metric_types).

-include("openapi.hrl").

-export([openapi_video_pin_metric_types/0]).

-export_type([openapi_video_pin_metric_types/0]).

-type openapi_video_pin_metric_types() ::
  binary().

openapi_video_pin_metric_types() ->
  elements([<<"IMPRESSION">>, <<"OUTBOUND_CLICK">>, <<"PIN_CLICK">>, <<"SAVE">>, <<"SAVE_RATE">>, <<"VIDEO_MRC_VIEW">>, <<"VIDEO_10S_VIEW">>, <<"QUARTILE_95_PERCENT_VIEW">>, <<"VIDEO_V50_WATCH_TIME">>, <<"VIDEO_START">>, <<"VIDEO_AVG_WATCH_TIME">>, <<"TOTAL_COMMENTS">>, <<"TOTAL_REACTIONS">>]).

