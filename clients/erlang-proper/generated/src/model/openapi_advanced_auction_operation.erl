-module(openapi_advanced_auction_operation).

-include("openapi.hrl").

-export([openapi_advanced_auction_operation/0]).

-export_type([openapi_advanced_auction_operation/0]).

-type openapi_advanced_auction_operation() ::
  binary().

openapi_advanced_auction_operation() ->
  elements([<<"UPSERT">>, <<"DELETE">>]).

