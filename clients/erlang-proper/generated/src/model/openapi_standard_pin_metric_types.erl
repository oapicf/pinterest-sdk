-module(openapi_standard_pin_metric_types).

-include("openapi.hrl").

-export([openapi_standard_pin_metric_types/0]).

-export_type([openapi_standard_pin_metric_types/0]).

-type openapi_standard_pin_metric_types() ::
  binary().

openapi_standard_pin_metric_types() ->
  elements([<<"IMPRESSION">>, <<"OUTBOUND_CLICK">>, <<"PIN_CLICK">>, <<"SAVE">>, <<"SAVE_RATE">>, <<"TOTAL_COMMENTS">>, <<"TOTAL_REACTIONS">>, <<"USER_FOLLOW">>, <<"PROFILE_VISIT">>]).

