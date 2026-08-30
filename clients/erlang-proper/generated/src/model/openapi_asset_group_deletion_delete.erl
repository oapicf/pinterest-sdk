-module(openapi_asset_group_deletion_delete).

-include("openapi.hrl").

-export([openapi_asset_group_deletion_delete/0]).

-export([openapi_asset_group_deletion_delete/1]).

-export_type([openapi_asset_group_deletion_delete/0]).

-type openapi_asset_group_deletion_delete() ::
  [ {'asset_groups_to_delete', list(binary()) }
  ].


openapi_asset_group_deletion_delete() ->
    openapi_asset_group_deletion_delete([]).

openapi_asset_group_deletion_delete(Fields) ->
  Default = [ {'asset_groups_to_delete', list(binary(), 1, 50) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

