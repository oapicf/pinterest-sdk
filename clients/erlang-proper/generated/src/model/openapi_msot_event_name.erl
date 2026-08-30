-module(openapi_msot_event_name).

-include("openapi.hrl").

-export([openapi_msot_event_name/0]).

-export_type([openapi_msot_event_name/0]).

-type openapi_msot_event_name() ::
  binary().

openapi_msot_event_name() ->
  elements([<<"add_to_cart">>, <<"checkout">>, <<"lead">>, <<"signup">>]).

