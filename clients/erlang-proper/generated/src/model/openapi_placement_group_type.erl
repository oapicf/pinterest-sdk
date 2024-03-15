-module(openapi_placement_group_type).

-include("openapi.hrl").

-export([openapi_placement_group_type/0]).

-export_type([openapi_placement_group_type/0]).

-type openapi_placement_group_type() ::
  binary().

openapi_placement_group_type() ->
  elements([<<"ALL">>, <<"SEARCH">>, <<"BROWSE">>, <<"OTHER">>]).

