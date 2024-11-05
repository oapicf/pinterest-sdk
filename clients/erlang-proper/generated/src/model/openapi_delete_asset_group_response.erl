-module(openapi_delete_asset_group_response).

-include("openapi.hrl").

-export([openapi_delete_asset_group_response/0]).

-export([openapi_delete_asset_group_response/1]).

-export_type([openapi_delete_asset_group_response/0]).

-type openapi_delete_asset_group_response() ::
  [ {'deleted_asset_groups', list(binary()) }
  | {'exceptions', list(openapi_delete_asset_group_response_exceptions_inner:openapi_delete_asset_group_response_exceptions_inner()) }
  ].


openapi_delete_asset_group_response() ->
    openapi_delete_asset_group_response([]).

openapi_delete_asset_group_response(Fields) ->
  Default = [ {'deleted_asset_groups', list(binary()) }
            , {'exceptions', list(openapi_delete_asset_group_response_exceptions_inner:openapi_delete_asset_group_response_exceptions_inner()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

