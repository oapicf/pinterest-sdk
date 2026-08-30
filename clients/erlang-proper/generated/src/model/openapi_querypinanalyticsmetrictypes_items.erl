-module(openapi_querypinanalyticsmetrictypes_items).

-include("openapi.hrl").

-export([openapi_querypinanalyticsmetrictypes_items/0]).

-export_type([openapi_querypinanalyticsmetrictypes_items/0]).

-type openapi_querypinanalyticsmetrictypes_items() ::
  binary().

openapi_querypinanalyticsmetrictypes_items() ->
  elements([<<"IMPRESSION">>, <<"OUTBOUND_CLICK">>, <<"PIN_CLICK">>, <<"SAVE">>, <<"SAVE_RATE">>, <<"TOTAL_COMMENTS">>, <<"TOTAL_REACTIONS">>, <<"USER_FOLLOW">>, <<"PROFILE_VISIT">>, <<"VIDEO_MRC_VIEW">>, <<"VIDEO_10S_VIEW">>, <<"QUARTILE_95_PERCENT_VIEW">>, <<"VIDEO_V50_WATCH_TIME">>, <<"VIDEO_START">>, <<"VIDEO_AVG_WATCH_TIME">>]).

