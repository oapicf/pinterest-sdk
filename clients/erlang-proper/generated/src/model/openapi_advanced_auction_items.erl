-module(openapi_advanced_auction_items).

-include("openapi.hrl").

-export([openapi_advanced_auction_items/0]).

-export([openapi_advanced_auction_items/1]).

-export_type([openapi_advanced_auction_items/0]).

-type openapi_advanced_auction_items() ::
  [ {'catalog_id', binary() }
  | {'items', list(openapi_advanced_auction_item:openapi_advanced_auction_item()) }
  ].


openapi_advanced_auction_items() ->
    openapi_advanced_auction_items([]).

openapi_advanced_auction_items(Fields) ->
  Default = [ {'catalog_id', binary() }
            , {'items', list(openapi_advanced_auction_item:openapi_advanced_auction_item()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

