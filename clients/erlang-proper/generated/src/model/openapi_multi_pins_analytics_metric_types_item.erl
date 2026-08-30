-module(openapi_multi_pins_analytics_metric_types_item).

-include("openapi.hrl").

-export([openapi_multi_pins_analytics_metric_types_item/0]).

-export_type([openapi_multi_pins_analytics_metric_types_item/0]).

-type openapi_multi_pins_analytics_metric_types_item() ::
  binary().

openapi_multi_pins_analytics_metric_types_item() ->
  elements([<<"IMPRESSION">>, <<"OUTBOUND_CLICK">>, <<"PIN_CLICK">>, <<"SAVE">>, <<"SAVE_RATE">>, <<"TOTAL_COMMENTS">>, <<"TOTAL_REACTIONS">>, <<"USER_FOLLOW">>, <<"PROFILE_VISIT">>, <<"VIDEO_MRC_VIEW">>, <<"VIDEO_10S_VIEW">>, <<"QUARTILE_95_PERCENT_VIEW">>, <<"VIDEO_V50_WATCH_TIME">>, <<"VIDEO_START">>, <<"VIDEO_AVG_WATCH_TIME">>]).

