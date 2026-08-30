-module(openapi_queryvideopinmetrictypes_items).

-include("openapi.hrl").

-export([openapi_queryvideopinmetrictypes_items/0]).

-export_type([openapi_queryvideopinmetrictypes_items/0]).

-type openapi_queryvideopinmetrictypes_items() ::
  binary().

openapi_queryvideopinmetrictypes_items() ->
  elements([<<"IMPRESSION">>, <<"SAVE">>, <<"VIDEO_MRC_VIEW">>, <<"VIDEO_AVG_WATCH_TIME">>, <<"VIDEO_V50_WATCH_TIME">>, <<"QUARTILE_95_PERCENT_VIEW">>, <<"VIDEO_10S_VIEW">>, <<"VIDEO_START">>, <<"OUTBOUND_CLICK">>]).

