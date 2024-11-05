-module(openapi_advanced_auction_item).

-include("openapi.hrl").

-export([openapi_advanced_auction_item/0]).

-export([openapi_advanced_auction_item/1]).

-export_type([openapi_advanced_auction_item/0]).

-type openapi_advanced_auction_item() ::
  [ {'item_id', binary() }
  | {'country', openapi_country:openapi_country() }
  | {'language', openapi_language:openapi_language() }
  | {'bid_options', openapi_advanced_auction_bid_options:openapi_advanced_auction_bid_options() }
  ].


openapi_advanced_auction_item() ->
    openapi_advanced_auction_item([]).

openapi_advanced_auction_item(Fields) ->
  Default = [ {'item_id', binary() }
            , {'country', openapi_country:openapi_country() }
            , {'language', openapi_language:openapi_language() }
            , {'bid_options', openapi_advanced_auction_bid_options:openapi_advanced_auction_bid_options() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

