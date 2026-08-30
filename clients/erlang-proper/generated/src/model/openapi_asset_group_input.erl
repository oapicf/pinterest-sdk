-module(openapi_asset_group_input).

-include("openapi.hrl").

-export([openapi_asset_group_input/0]).

-export([openapi_asset_group_input/1]).

-export_type([openapi_asset_group_input/0]).

-type openapi_asset_group_input() ::
  [ {'asset_group', openapi_asset_group_binding:openapi_asset_group_binding() }
  ].


openapi_asset_group_input() ->
    openapi_asset_group_input([]).

openapi_asset_group_input(Fields) ->
  Default = [ {'asset_group', openapi_asset_group_binding:openapi_asset_group_binding() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

