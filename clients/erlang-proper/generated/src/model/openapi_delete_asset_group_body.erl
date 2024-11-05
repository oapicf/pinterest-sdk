-module(openapi_delete_asset_group_body).

-include("openapi.hrl").

-export([openapi_delete_asset_group_body/0]).

-export([openapi_delete_asset_group_body/1]).

-export_type([openapi_delete_asset_group_body/0]).

-type openapi_delete_asset_group_body() ::
  [ {'asset_groups_to_delete', list(binary()) }
  ].


openapi_delete_asset_group_body() ->
    openapi_delete_asset_group_body([]).

openapi_delete_asset_group_body(Fields) ->
  Default = [ {'asset_groups_to_delete', list(binary(), 1, 50) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

