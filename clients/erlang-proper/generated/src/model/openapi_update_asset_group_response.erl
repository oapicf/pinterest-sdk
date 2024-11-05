-module(openapi_update_asset_group_response).

-include("openapi.hrl").

-export([openapi_update_asset_group_response/0]).

-export([openapi_update_asset_group_response/1]).

-export_type([openapi_update_asset_group_response/0]).

-type openapi_update_asset_group_response() ::
  [ {'updated_asset_groups', list(openapi_asset_group_binding:openapi_asset_group_binding()) }
  | {'exceptions', list(openapi_update_asset_group_response_exceptions_inner:openapi_update_asset_group_response_exceptions_inner()) }
  ].


openapi_update_asset_group_response() ->
    openapi_update_asset_group_response([]).

openapi_update_asset_group_response(Fields) ->
  Default = [ {'updated_asset_groups', list(openapi_asset_group_binding:openapi_asset_group_binding()) }
            , {'exceptions', list(openapi_update_asset_group_response_exceptions_inner:openapi_update_asset_group_response_exceptions_inner()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

