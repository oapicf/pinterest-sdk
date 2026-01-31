-module(openapi_delete_asset_group_response_exceptions_inner).

-include("openapi.hrl").

-export([openapi_delete_asset_group_response_exceptions_inner/0]).

-export([openapi_delete_asset_group_response_exceptions_inner/1]).

-export_type([openapi_delete_asset_group_response_exceptions_inner/0]).

-type openapi_delete_asset_group_response_exceptions_inner() ::
  [ {'asset_group_id', binary() }
  | {'code', integer() }
  | {'message', binary() }
  ].


openapi_delete_asset_group_response_exceptions_inner() ->
    openapi_delete_asset_group_response_exceptions_inner([]).

openapi_delete_asset_group_response_exceptions_inner(Fields) ->
  Default = [ {'asset_group_id', binary() }
            , {'code', integer() }
            , {'message', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

