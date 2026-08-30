-module(openapi_collections_header_type).

-include("openapi.hrl").

-export([openapi_collections_header_type/0]).

-export_type([openapi_collections_header_type/0]).

-type openapi_collections_header_type() ::
  binary().

openapi_collections_header_type() ->
  elements([<<"SHOP_THIS_COLLECTION">>, <<"EXPLORE_THIS_COLLECTION">>, <<"NO_HEADER">>, <<"ON_SALE">>, <<"GET_DEAL">>, <<"">>]).

