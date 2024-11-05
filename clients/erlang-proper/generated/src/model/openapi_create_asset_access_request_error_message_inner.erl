-module(openapi_create_asset_access_request_error_message_inner).

-include("openapi.hrl").

-export([openapi_create_asset_access_request_error_message_inner/0]).

-export([openapi_create_asset_access_request_error_message_inner/1]).

-export_type([openapi_create_asset_access_request_error_message_inner/0]).

-type openapi_create_asset_access_request_error_message_inner() ::
  [ {'code', integer() }
  | {'messages', list(binary()) }
  ].


openapi_create_asset_access_request_error_message_inner() ->
    openapi_create_asset_access_request_error_message_inner([]).

openapi_create_asset_access_request_error_message_inner(Fields) ->
  Default = [ {'code', integer() }
            , {'messages', list(binary()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

