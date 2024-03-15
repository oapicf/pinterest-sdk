-module(openapi_pacing_delivery_type).

-include("openapi.hrl").

-export([openapi_pacing_delivery_type/0]).

-export_type([openapi_pacing_delivery_type/0]).

-type openapi_pacing_delivery_type() ::
  binary().

openapi_pacing_delivery_type() ->
  elements([<<"STANDARD">>, <<"ACCELERATED">>]).

