-module(openapi_conversion_attribution_window_days).

-include("openapi.hrl").

-export([openapi_conversion_attribution_window_days/0]).

-export_type([openapi_conversion_attribution_window_days/0]).

-type openapi_conversion_attribution_window_days() ::
  binary().

openapi_conversion_attribution_window_days() ->
  elements([<<"0">>, <<"1">>, <<"7">>, <<"14">>, <<"30">>, <<"60">>]).

