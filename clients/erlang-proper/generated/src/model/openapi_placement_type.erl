-module(openapi_placement_type).

-include("openapi.hrl").

-export([openapi_placement_type/0]).

-export_type([openapi_placement_type/0]).

-type openapi_placement_type() ::
  binary().

openapi_placement_type() ->
  elements([<<"SEARCH">>, <<"BROWSE">>, <<"RELATED_PINS">>]).

