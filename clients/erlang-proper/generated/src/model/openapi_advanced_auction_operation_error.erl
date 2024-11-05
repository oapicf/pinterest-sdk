-module(openapi_advanced_auction_operation_error).

-include("openapi.hrl").

-export([openapi_advanced_auction_operation_error/0]).

-export([openapi_advanced_auction_operation_error/1]).

-export_type([openapi_advanced_auction_operation_error/0]).

-type openapi_advanced_auction_operation_error() ::
  [ {'code', integer() }
  | {'message', binary() }
  ].


openapi_advanced_auction_operation_error() ->
    openapi_advanced_auction_operation_error([]).

openapi_advanced_auction_operation_error(Fields) ->
  Default = [ {'code', integer() }
            , {'message', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

