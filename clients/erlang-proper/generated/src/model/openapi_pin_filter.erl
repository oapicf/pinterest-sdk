-module(openapi_pin_filter).

-include("openapi.hrl").

-export([openapi_pin_filter/0]).

-export_type([openapi_pin_filter/0]).

-type openapi_pin_filter() ::
  binary().

openapi_pin_filter() ->
  elements([<<"exclude_native">>, <<"exclude_repins">>, <<"has_been_promoted">>]).

