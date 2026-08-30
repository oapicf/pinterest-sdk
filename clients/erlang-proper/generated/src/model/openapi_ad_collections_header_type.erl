-module(openapi_ad_collections_header_type).

-include("openapi.hrl").

-export([openapi_ad_collections_header_type/0]).

-export_type([openapi_ad_collections_header_type/0]).

-type openapi_ad_collections_header_type() ::
  binary().

openapi_ad_collections_header_type() ->
  elements([<<"SHOP_THIS_COLLECTION">>, <<"EXPLORE_THIS_COLLECTION">>, <<"NO_HEADER">>, <<"">>]).

