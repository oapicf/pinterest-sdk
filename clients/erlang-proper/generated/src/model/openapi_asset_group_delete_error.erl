-module(openapi_asset_group_delete_error).

-include("openapi.hrl").

-export([openapi_asset_group_delete_error/0]).

-export([openapi_asset_group_delete_error/1]).

-export_type([openapi_asset_group_delete_error/0]).

-type openapi_asset_group_delete_error() ::
  [ {'asset_group_id', binary() }
  | {'code', integer() }
  | {'message', binary() }
  ].


openapi_asset_group_delete_error() ->
    openapi_asset_group_delete_error([]).

openapi_asset_group_delete_error(Fields) ->
  Default = [ {'asset_group_id', binary() }
            , {'code', integer() }
            , {'message', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

