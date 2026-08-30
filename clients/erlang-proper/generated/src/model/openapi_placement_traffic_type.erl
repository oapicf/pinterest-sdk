-module(openapi_placement_traffic_type).

-include("openapi.hrl").

-export([openapi_placement_traffic_type/0]).

-export_type([openapi_placement_traffic_type/0]).

-type openapi_placement_traffic_type() ::
  binary().

openapi_placement_traffic_type() ->
  elements([<<"ALL">>, <<"TWO_COLUMN_FEED">>, <<"FULLSCREEN_FEED">>, <<"">>]).

