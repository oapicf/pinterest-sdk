-module(openapi_top_pins_sort_by).

-include("openapi.hrl").

-export([openapi_top_pins_sort_by/0]).

-export_type([openapi_top_pins_sort_by/0]).

-type openapi_top_pins_sort_by() ::
  binary().

openapi_top_pins_sort_by() ->
  elements([<<"ENGAGEMENT">>, <<"SAVE">>, <<"IMPRESSION">>, <<"OUTBOUND_CLICK">>, <<"PIN_CLICK">>]).

