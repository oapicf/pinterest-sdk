-module(openapi_querymetrictypes_items).

-include("openapi.hrl").

-export([openapi_querymetrictypes_items/0]).

-export_type([openapi_querymetrictypes_items/0]).

-type openapi_querymetrictypes_items() ::
  binary().

openapi_querymetrictypes_items() ->
  elements([<<"ENGAGEMENT">>, <<"ENGAGEMENT_RATE">>, <<"IMPRESSION">>, <<"OUTBOUND_CLICK">>, <<"OUTBOUND_CLICK_RATE">>, <<"PIN_CLICK">>, <<"PIN_CLICK_RATE">>, <<"SAVE">>, <<"SAVE_RATE">>]).

