-module(openapi_update_asset_group_body).

-include("openapi.hrl").

-export([openapi_update_asset_group_body/0]).

-export([openapi_update_asset_group_body/1]).

-export_type([openapi_update_asset_group_body/0]).

-type openapi_update_asset_group_body() ::
  [ {'asset_groups_to_update', list(openapi_update_asset_group_body_asset_groups_to_update_inner:openapi_update_asset_group_body_asset_groups_to_update_inner()) }
  ].


openapi_update_asset_group_body() ->
    openapi_update_asset_group_body([]).

openapi_update_asset_group_body(Fields) ->
  Default = [ {'asset_groups_to_update', list(openapi_update_asset_group_body_asset_groups_to_update_inner:openapi_update_asset_group_body_asset_groups_to_update_inner()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

