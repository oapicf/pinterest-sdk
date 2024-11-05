-module(openapi_update_asset_group_response_exceptions_inner).

-include("openapi.hrl").

-export([openapi_update_asset_group_response_exceptions_inner/0]).

-export([openapi_update_asset_group_response_exceptions_inner/1]).

-export_type([openapi_update_asset_group_response_exceptions_inner/0]).

-type openapi_update_asset_group_response_exceptions_inner() ::
  [ {'code', integer() }
  | {'message', binary() }
  | {'asset_group_id', binary() }
  ].


openapi_update_asset_group_response_exceptions_inner() ->
    openapi_update_asset_group_response_exceptions_inner([]).

openapi_update_asset_group_response_exceptions_inner(Fields) ->
  Default = [ {'code', integer() }
            , {'message', binary() }
            , {'asset_group_id', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

