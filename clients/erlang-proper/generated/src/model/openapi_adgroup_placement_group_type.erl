-module(openapi_adgroup_placement_group_type).

-include("openapi.hrl").

-export([openapi_adgroup_placement_group_type/0]).

-export_type([openapi_adgroup_placement_group_type/0]).

-type openapi_adgroup_placement_group_type() ::
  binary().

openapi_adgroup_placement_group_type() ->
  elements([<<"ALL">>, <<"SEARCH">>, <<"BROWSE">>, <<"OTHER">>]).

