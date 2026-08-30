-module(openapi_asset_access_request_error).

-include("openapi.hrl").

-export([openapi_asset_access_request_error/0]).

-export([openapi_asset_access_request_error/1]).

-export_type([openapi_asset_access_request_error/0]).

-type openapi_asset_access_request_error() ::
  [ {'code', integer() }
  | {'messages', list(binary()) }
  ].


openapi_asset_access_request_error() ->
    openapi_asset_access_request_error([]).

openapi_asset_access_request_error(Fields) ->
  Default = [ {'code', integer() }
            , {'messages', list(binary()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

