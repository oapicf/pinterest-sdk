-module(openapi_network_type).

-include("openapi.hrl").

-export([openapi_network_type/0]).

-export_type([openapi_network_type/0]).

-type openapi_network_type() ::
  binary().

openapi_network_type() ->
  elements([<<"wifi">>, <<"cellular_2g">>, <<"cellular_3g">>, <<"cellular_4g">>, <<"cellular_5g">>, <<"cellular_6g">>, <<"ethernet">>, <<"unknown">>]).

