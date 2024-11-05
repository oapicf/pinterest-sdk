-module(openapi_advanced_auction_bid_options).

-include("openapi.hrl").

-export([openapi_advanced_auction_bid_options/0]).

-export([openapi_advanced_auction_bid_options/1]).

-export_type([openapi_advanced_auction_bid_options/0]).

-type openapi_advanced_auction_bid_options() ::
  [ {'bid_in_micro_currency', integer() }
  | {'app_type_multipliers', openapi_app_type_multipliers:openapi_app_type_multipliers() }
  | {'placement_multipliers', openapi_placement_multipliers:openapi_placement_multipliers() }
  ].


openapi_advanced_auction_bid_options() ->
    openapi_advanced_auction_bid_options([]).

openapi_advanced_auction_bid_options(Fields) ->
  Default = [ {'bid_in_micro_currency', integer() }
            , {'app_type_multipliers', openapi_app_type_multipliers:openapi_app_type_multipliers() }
            , {'placement_multipliers', openapi_placement_multipliers:openapi_placement_multipliers() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

